package com.techelevator.controller;

import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardDAO;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CatController
{

	private CatCardDAO catCardDao;
	private CatFactService catFactService;
	private CatPicService catPicService;

	public CatController(CatCardDAO catCardDao, CatFactService catFactService, CatPicService catPicService)
	{
		this.catCardDao = catCardDao;
		this.catFactService = catFactService;
		this.catPicService = catPicService;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public CatCard getCatCard(@PathVariable long id)
	{
		return catCardDao.get(id);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<CatCard> getAllCatCards()
	{
		List<CatCard> catCardList = catCardDao.list();
		
		return catCardList;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void addNewCatCard(@Valid @RequestBody CatCard newCatCard)
	{
		catCardDao.save(newCatCard);
	}
	
	@ResponseStatus(HttpStatus.ACCEPTED)
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void updateCatCard (@Valid @RequestBody CatCard updateCatCard, @PathVariable long id)
	{
		catCardDao.update(id, updateCatCard);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteCatCard(@PathVariable long id)
	{
		catCardDao.delete(id);
	}
	
	@RequestMapping(value = "/random", method = RequestMethod.GET)
	public CatCard getRandomCatCard()
	{
		CatFact catFact = catFactService.getFact();
		CatPic catPic = catPicService.getPic();
		CatCard catCard = new CatCard();
		
		catCard.setCatFact(catFact.getText());
		catCard.setImgUrl(catPic.getFile());
				
		return catCard;
	}

}
