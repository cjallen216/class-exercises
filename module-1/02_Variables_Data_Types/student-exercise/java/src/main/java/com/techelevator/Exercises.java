package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
		### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		*/
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		
		System.out.println("1. Number of birds remaining = " + remainingNumberOfBirds);

		
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		*/
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		
		System.out.println("2. Extra birds = " + numberOfExtraBirds);

		
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */		
		int numberOfRaccoonsPlaying = 3;
		int numberOfRaccoonsWentHomeForDinner = 2;
		int numberOfRaccoonsLeft = numberOfRaccoonsPlaying - numberOfRaccoonsWentHomeForDinner;
		
		System.out.println("3. Number of raccoons left playing in the woods = " + numberOfRaccoonsLeft);

		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfLessBees = numberOfFlowers - numberOfBees;
		
		System.out.println("4. Number of less bees = " + numberOfLessBees);

		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int pigeonEatingBreadcrumbs = 1;
		pigeonEatingBreadcrumbs += 1;
		
		System.out.println("5. Number of pigeons eating breadcrumbs = " + pigeonEatingBreadcrumbs);

		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int fenceSittingOwls = 3;
		fenceSittingOwls += 2;
		
		System.out.println("6. Number of owls sitting on the fence = " + fenceSittingOwls);

		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorkingOnHome = 2;
		beaversWorkingOnHome -= 1;
		
		System.out.println("7. Beavers still working on their home = " + beaversWorkingOnHome);

		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSittingOnLimb = 2;
		toucansSittingOnLimb += 1;
		
		System.out.println("8. Number of toucans = " + toucansSittingOnLimb);
		

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nutsInTree = 2;
		int extraSquirrelsInTree = squirrelsInTree - nutsInTree;
		
		System.out.println("9. Extra squirrels in tree = " + extraSquirrelsInTree);
		

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int foundQuarterValue = 25;
		int foundDimeValue = 10;
		int foundNickelValue = 05;
		
		int numberOfQuarters = 1;
		int numberOfDimes = 1;
		int numberOfNickels = 2;
		
		int totalCents = (numberOfQuarters * foundQuarterValue) 
					   + (numberOfDimes * foundDimeValue) 
					   + (numberOfNickels * foundNickelValue);
		
		double hiltsFoundMoney = totalCents / 100.0;
		
		System.out.println("10. Mrs. Hilt's found money = $" + hiltsFoundMoney);
		

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int mrsBrierMuffins = 18;
		int mrsMacAdamsMuffins = 20;
		int mrsFlanneryMuffins = 17;
		
		int totalFirstGradeMuffins = mrsBrierMuffins + mrsMacAdamsMuffins + mrsFlanneryMuffins;
		
		System.out.println("11. Number of First Grader's Muffins = " + totalFirstGradeMuffins);
		

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoPrice = .24;
		double whistlePrice = .14;
		double totalPrice = yoyoPrice + whistlePrice;
		
		System.out.println("12. Total amount Mrs. Hilt spent = " + "$" + totalPrice);
		

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		
		System.out.println("13. Number of total marshmallows = " + totalMarshmallows);
		

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHiltHouse = 29;
		int snowAtBrecknockSchool = 17;
		int differenceInSnowInches = snowAtHiltHouse - snowAtBrecknockSchool;
		
		System.out.println("14. Mrs Hilt had " + differenceInSnowInches + " more inches than Brecknock Elementary School");
		

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int startingAmount = 10;
		int toyTruckAmount = 3;
		int pencilCaseAmount = 2;
		int endingAmount = startingAmount - toyTruckAmount - pencilCaseAmount;
		
		System.out.println("15. Mrs. Hilt has $" + endingAmount + " remaining.");
		

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbleCollection = 16;
		int lostMarbles = 7;
		int newMarbleCollection = marbleCollection - lostMarbles;
		
		System.out.println("16. Josh has " + newMarbleCollection + " remaining after losing " + lostMarbles);
		

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int megansSeashells = 19;
		int seashellGoal = 25;
		int remainingSeashells = seashellGoal - megansSeashells;
		
		System.out.println("17. Megan needs to find " + remainingSeashells + " seashells to get to " + seashellGoal);
		

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
		
		System.out.println("18. Brad has " + greenBalloons + " green balloons.");
		

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int martaBooks = 10;
		int totalBooksOnShelf = booksOnShelf + martaBooks;
		
		System.out.println("19. There are now " + totalBooksOnShelf + " books on the shelf after Marta added " + martaBooks);
		

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfBeesLegs = 6;
		int numberOfBees1 = 8;
		int totalNumberOfBeesLegs = numberOfBees1 * numberOfBeesLegs;
		
		System.out.println("20. " + numberOfBees1 + " bees have " + totalNumberOfBeesLegs + " total legs.");
		

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamConePrice = .99;
		iceCreamConePrice *= 2;
		
		System.out.println("21. Mrs. Hilt bought ice cones for $" + iceCreamConePrice);
		

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalBorderRocksNeeded = 125;
		int currentBorderRocks = 64;
		int neededBorderRocks = totalBorderRocksNeeded - currentBorderRocks;
		
		System.out.println("22. Mrs. Hilt needs " + neededBorderRocks + " more border rocks.");

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltMarbles = 38;
		int lostHiltMarbles = 15;
		int remainingHiltMarbles = hiltMarbles - lostHiltMarbles;
		
		System.out.println("23. Mrs. Hilt has " + remainingHiltMarbles + " marbles remaining after losing " + lostHiltMarbles);
		

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesToConcert = 78;
		int milesDriven = 32;
		int remainingMilesToDrive = milesToConcert - milesDriven;
		
		System.out.println("24. Mrs. Hilt and her sister have " + remainingMilesToDrive + " more miles to drive.");

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		double timeSpentShovelingSaturday = 1.50;
		double timeSpentShovelingSunday = .75;
		double totalTimeSpentShoveling = timeSpentShovelingSaturday + timeSpentShovelingSunday;
		
		System.out.println("25. Mrs. Hilt spent " + totalTimeSpentShoveling + " hours shoveling.");
		

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int totalHotDogPurchased = 6;
		double hotDogCost = .50;
		double totalHotDogCost = hotDogCost * totalHotDogPurchased;
		
		System.out.println("26. Mrs. Hilt bought " + totalHotDogPurchased + " for $" + totalHotDogCost);
		

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double totalPencilMoney = .50;
		double pencilPrice = .07;
		double numberOfPencilsBought = pencilPrice / totalPencilMoney;
		
		System.out.println("27. Mrs. Hilt can buy " + numberOfPencilsBought + " with her " + "$" + totalPencilMoney);
		

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterfliesSeen = 33;
		int orangeButterflies = 20;
		int redButterflies = totalButterfliesSeen - orangeButterflies;
		
		System.out.println("28. Mrs. Hilt saw " + redButterflies + " red butterflies.");
		

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double kateMoney = 1.00;
		double candyCost = .54;
		double changeForCandy = kateMoney - candyCost;
		
		System.out.println("29. Kate received $" + changeForCandy + " in change.");

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int beginningTrees = 13;
		int plantedTrees = 12;
		int totalTrees = beginningTrees + plantedTrees;
		
		System.out.println("30. Mark now has " + totalTrees + " tree after planting " + plantedTrees + " more.");
		

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hoursInADay = 24;
		int daysUntilGrandma = 2;
		int hoursUntilGrandma = hoursInADay + daysUntilGrandma;
		
		System.out.println("31. Hours until Joy sees her grandma = " + hoursUntilGrandma);
		

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimCousins = 4;
		int numberOfPiecesOfGum = 5;
		int numberOfPiecesOfGumGivenToCousins = kimCousins * numberOfPiecesOfGum;
		
		System.out.println("32. Number of pieces of gum given to Kim's cousins = " + numberOfPiecesOfGumGivenToCousins);
		

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danMoney = 3.00;
		double candyBarPrice = 1.00;
		double remainingDanMoney = danMoney - candyBarPrice;
		
		System.out.println("33. Dan has $" + remainingDanMoney + " after buying a candy bar.");

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int numberOfPeoplePerBoat = 3;
		int numberOfPeopleOnBoats = boatsInLake + numberOfPeoplePerBoat;
		
		System.out.println("34. Number of people on boats on the lake = " + numberOfPeopleOnBoats);
		

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenLegos = 380;
		int lostLegos = 57;
		int remainingLegos = ellenLegos - lostLegos;
		
		System.out.println("35. Number of Ellen's remaining legos = " + remainingLegos);
		

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int currentArthurMuffins = 35;
		int arthurMuffinGoal = 83;
		int remainingMuffinsToMake = arthurMuffinGoal - currentArthurMuffins;
		
		System.out.println("36. Number of muffins Arthur needs to make = " + remainingMuffinsToMake);
		

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int numberOfMoreWillyCrayons = willyCrayons - lucyCrayons;
		
		System.out.println("37. Willy has " + numberOfMoreWillyCrayons + " more crayons than Lucy.");
		

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int totalNumberOfStickers = stickersPerPage * pagesOfStickers;
		
		System.out.println("38. Total number of stickers = " + totalNumberOfStickers);
		

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalCupcakes = 96;
		int numberOfChildren = 8;
		int numberOfCupcakesPerChild = totalCupcakes / numberOfChildren;
		
		System.out.println("39. Each child will have " + numberOfCupcakesPerChild + " cupcakes.");
		

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int numberOfGinerbreadCookies = 47;
		int numberOfCookiesPerJar = 6;
		int remainderOfCookiesNotInJar = numberOfGinerbreadCookies % numberOfCookiesPerJar;
		
		System.out.println("40. Number of gingerbread cookies not in a jar = " + remainderOfCookiesNotInJar);
		

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int preparedCroissants = 59;
		int numberOfNeighbors = 8;
		int remainingCroissants = preparedCroissants % numberOfNeighbors;
		
		System.out.println("41. Number of croissants left after giving equal amount to neighbors = " + remainingCroissants);
		

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerTray = 12;
		int cookiesNeeded = 276;
		int cookieTraysNeeded = cookiesNeeded / cookiesPerTray;
		
		System.out.println("42. Number of cookie trays needed = " + cookieTraysNeeded);
		

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzelServing = 12;
		int pretzelsMade = 480;
		int totalPretzelServings = pretzelsMade / pretzelServing;
		
		System.out.println("43. Total bite-sized pretzel servings = " + totalPretzelServings);
				

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakesBaked = 53;
		int lemonCupcakesLeftAtHome = 2;
		int lemonCupcakesPerBox = 3;
		int lemonCupcakesForOrphans = lemonCupcakesBaked - lemonCupcakesLeftAtHome;
		int lemonCupcakeBoxesForOrphans = lemonCupcakesForOrphans / lemonCupcakesPerBox;
		
		System.out.println("44. Boxes of lemon cupcakes for the orphanage = " + lemonCupcakeBoxesForOrphans);
		

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticks = 74;
		int numberOfPeopleServedCarrots = 12;
		int remainingCarrotSticks = carrotSticks % numberOfPeopleServedCarrots;
		
		System.out.println("45. Number of remaining carrot sticks = " + remainingCarrotSticks);
		

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int numberOfTeddyBears = 98;
		int numberOfTeddyBearsPerShelf = 7;
		int numberOfShelvesWithTeddyBears = numberOfTeddyBears / numberOfTeddyBearsPerShelf;
		
		System.out.println("46. Number of shelves with teddy bears = " + numberOfShelvesWithTeddyBears);
		

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int numberOfPicturePerAlbum = 20;
		int numberOfPictures = 480;
		int numberOfAlbumsNeeded = numberOfPictures / numberOfPicturePerAlbum;
		
		System.out.println("47. Number of albums needed = " + numberOfAlbumsNeeded);
		

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalTradingCards = 94;
		int tradingCardsPerBox = 8;
		int fullTradingCardBoxes = totalTradingCards / tradingCardsPerBox;
		int unfilledTradingCardBoxes = totalTradingCards % tradingCardsPerBox;
		
		System.out.println("48. Full trading card boxes = " + fullTradingCardBoxes);
		System.out.println("48a. Unfilled trading card boxes = " + unfilledTradingCardBoxes);
		

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalBooks = 210;
		int totalBookshelves = 10;
		int booksPerShelf = totalBooks / totalBookshelves;
		
		System.out.println("49. Books per shelf = " + booksPerShelf);
		

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int cristinaBakedCroissants = 17;
		int cristinaGuests = 7;
		int numberOfCroissantsPerGuest = cristinaBakedCroissants / cristinaGuests;
		
		System.out.println("50. Number of croissants per guest = " + numberOfCroissantsPerGuest);
		

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		double averageHoursBillPaintsPerRoom = 2.15;
		double averageHoursJillPaintsPerRoom = 1.90;
		int totalRoomsPainted = 5;
		double billFiveRoomAverage = averageHoursBillPaintsPerRoom * totalRoomsPainted;
		double jillFiveRoomAverage = averageHoursJillPaintsPerRoom * totalRoomsPainted;
		double bothFiveRoomAverage = billFiveRoomAverage + jillFiveRoomAverage;
		int roomSizeLength = 12;
		int roomSizeWidth = 14;
		int totalRoomSize = roomSizeLength * roomSizeWidth;
		int fiveRoomSize = totalRoomSize * totalRoomsPainted;
		double totalTimeSpentPainting = fiveRoomSize / bothFiveRoomAverage;  
		System.out.println("Hours to paint 5 12 x 14 rooms = " + totalTimeSpentPainting);
		
		System.out.println(bothFiveRoomAverage);
		System.out.println(totalRoomSize);
		System.out.println(fiveRoomSize);		

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		String firstName = "Chris";
		String lastName = "Allen";
		String middleInitial = "J.";
		String fullName = lastName + ", " + firstName + " " + middleInitial;
		System.out.println("Full Name = " + fullName);
		

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		double distanceBetweenNewYorkAndChicago = 800;
		double milesTraveled = 537;
		double percentTraveled = milesTraveled / distanceBetweenNewYorkAndChicago;
		System.out.println("Percent completed = " + percentTraveled);


	}

}
