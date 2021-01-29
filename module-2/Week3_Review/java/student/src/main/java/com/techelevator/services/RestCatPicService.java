package com.techelevator.services;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.techelevator.model.CatPic;

@Component
public class RestCatPicService implements CatPicService
{
	private static final String CAT_PIC_URL = "https://random-cat-image.herokuapp.com/";
	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public CatPic getPic()
	{
		CatPic catPic = restTemplate.getForObject(CAT_PIC_URL, CatPic.class);
		return catPic;
	}

}
