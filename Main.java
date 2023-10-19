import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to YouTube Channel Name Suggester");
        System.out.println("What type of channel do you want?");

        // Enpty line break
        System.out.println();

        System.out.println("Categories:");
        System.out.println("1. Gaming");
        System.out.println("2. Lifestyle Vlogs");
        System.out.println("3. Cooking and Recipes");
        System.out.println("4. Travel and Adventure");
        System.out.println("5. Tech Reviews");
        System.out.println("6. Beauty and Makeup");
        System.out.println("7. DIY and Crafting");
        System.out.println("8. Fashion and Style");
        System.out.println("9. Health and Fitness");
        System.out.println("10. Comedy and Skits");
        System.out.println("11. Educational");
        System.out.println("12. Music and Covers");
        System.out.println("13. Unboxing and Product Reviews");
        System.out.println("14. Book Reviews and Literature");
        System.out.println("15. Motivation and Self-Improvement");
        System.out.println("16. Parenting and Family Vlogs");
        System.out.println("17. Pets and Animals");
        System.out.println("18. Finance and Investing");
        System.out.println("19. Science and Technology Explainers");
        System.out.println("20. Paranormal and Mystery");

        // Get User's Choice for Channel Suggestions 
        int choice = getUserChoice();

        switch (choice) {
            case 1:
                suggestGamingChannels();
                break;
            case 2:
                suggestLifestyleChannels();
                break;
            case 3:
                suggestCookingChannels();
                break;
            case 4:
                suggestTravelChannels();
                break;
            case 5:
                suggestTechReviewChannels();
                break;
            case 6:
                suggestBeautyChannels();
                break;
            case 7:
                suggestDIYChannels();
                break;
            case 8:
                suggestFashionChannels();
                break;
            case 9:
                suggestHealthChannels();
                break;
            case 10:
                suggestComedyChannels();
                break;
            case 11:
                suggestEducationalChannels();
                break;
            case 12:
                suggestMusicChannels();
                break;
            case 13:
                suggestUnboxingChannels();
                break;
            case 14:
                suggestBookChannels();
                break;
            case 15:
                suggestMotivationChannels();
                break;
            case 16:
                suggestParentingChannels();
                break;
            case 17:
                suggestPetChannels();
                break;
            case 18:
                suggestFinanceChannels();
                break;
            case 19:
                suggestScienceChannels();
                break;
            case 20:
                suggestParanormalChannels();
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid category.");
        }
    }

    // Ask 
    public static int getUserChoice() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            return choice;
        }
    }

    public static void suggestGamingChannels() {
        System.out.println("Names for Gaming Channel Category:");
        
        // Enpty line break
        System.out.println();

        System.out.println("1. GameMaster");
        System.out.println("2. GamerX");
        System.out.println("3. ProGaming");
        System.out.println("4. RetroGamer");
        System.out.println("5. eSportsZone");
        System.out.println("6. StreamTeam");
        System.out.println("7. GamingLegends");
        System.out.println("8. PixelPioneers");
        System.out.println("9. ConsoleCrusaders");
        System.out.println("10. GameOn");
        System.out.println("11. QuestMasters");
        System.out.println("12. GameHaven");
        System.out.println("13. PVPPro");
        System.out.println("14. GameFusion");
        System.out.println("15. PixelQuest");
        System.out.println("16. ArcadeHeroes");
        System.out.println("17. GameChangers");
        System.out.println("18. ProPlayersOnly");
        System.out.println("19. 8BitExplorers");
        System.out.println("20. PowerUP");
        System.out.println("21. BossBattles");
        System.out.println("22. GameGurus");
        System.out.println("23. GameGlitch");
        System.out.println("24. UltimateGamer");
        System.out.println("25. SpeedRunners");
        System.out.println("26. GamePlanet");
        System.out.println("27. StrategySavvy");
        System.out.println("28. GamersUnite");
        System.out.println("29. PlayMasters");
        System.out.println("30. QuestQuest");
        System.out.println("31. GamingSage");
        System.out.println("32. NerdNest");
        System.out.println("33. GameXperts");
        System.out.println("34. JoystickJunkies");
        System.out.println("35. GameMastersGuild");
        System.out.println("36. RetroRivals");
        System.out.println("37. PixelPilgrims");
        System.out.println("38. LevelUpLegends");
        System.out.println("39. BossBrawlers");
        System.out.println("40. GameOnDemand");
        System.out.println("41. StrategyStars");
        System.out.println("42. GameGlobe");
        System.out.println("43. GameChamp");
        System.out.println("44. ProPlayPalace");
        System.out.println("45. GamerDynasty");
        System.out.println("46. GameFrenzy");
        System.out.println("47. ArcadeAces");
        System.out.println("48. PixelPioneers");
        System.out.println("49. PowerPlayerPro");
        System.out.println("50. GamersGalaxy");

    }

    public static void suggestLifestyleChannels() {
        System.out.println("Names for Lifestyle Channel Category:");

        // Enpty line break
        System.out.println();

        System.out.println("1. SunnyDay Vlogs");
        System.out.println("2. HealthyLiving");
        System.out.println("3. TravelAdventures");
        System.out.println("4. Fashionista");
        System.out.println("5. FoodieFinds");
        System.out.println("6. HomeDecor");
        System.out.println("7. DIYInspiration");
        System.out.println("8. FitnessFreaks");
        System.out.println("9. AdventureJunkie");
        System.out.println("10. PetLovers");
        System.out.println("11. LifeUnscripted");
        System.out.println("12. WanderlustDiaries");
        System.out.println("13. StylishSundays");
        System.out.println("14. CulinaryCrafters");
        System.out.println("15. ThriftyTreasures");
        System.out.println("16. CraftingCorner");
        System.out.println("17. WellnessWorld");
        System.out.println("18. TheFashionFiles");
        System.out.println("19. HappyHomemakers");
        System.out.println("20. ExploreEverywhere");
        System.out.println("21. FoodieFiesta");
        System.out.println("22. FitnessFusion");
        System.out.println("23. CreativeCanvas");
        System.out.println("24. TravelTales");
        System.out.println("25. PetPals");
        System.out.println("26. LifestyleLuxe");
        System.out.println("27. HomeSweetHome");
        System.out.println("28. NatureAdventures");
        System.out.println("29. HealthandHarmony");
        System.out.println("30. DailyDelights");
        System.out.println("31. WanderlustWonders");
        System.out.println("32. FashionFlair");
        System.out.println("33. TheGoodLifeDiaries");
        System.out.println("34. CraftyCreations");
        System.out.println("35. FoodFables");
        System.out.println("36. FitnessFables");
        System.out.println("37. HomeHeaven");
        System.out.println("38. CreativeChronicles");
        System.out.println("39. TravelTimeTales");
        System.out.println("40. PetParadise");
        System.out.println("41. LifeLuminance");
        System.out.println("42. HomeHarbor");
        System.out.println("43. AdventureAlmanac");
        System.out.println("44. WellnessWhisper");
        System.out.println("45. FashionFable");
        System.out.println("46. TheJoyfulJourney");
        System.out.println("47. CraftingCanvas");
        System.out.println("48. EpicExplorers");
        System.out.println("49. CulinaryCurators");
        System.out.println("50. LifestyleLounge");

    }

    public static void suggestCookingChannels() {
        System.out.println("Names for Cooking Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. TastyTales");
        System.out.println("2. CulinaryCrafters");
        System.out.println("3. MasterChefs");
        System.out.println("4. FoodieFiesta");
        System.out.println("5. KitchenKings");
        System.out.println("6. DeliciousDelights");
        System.out.println("7. GourmetGurus");
        System.out.println("8. FlavorFusion");
        System.out.println("9. RecipeRealm");
        System.out.println("10. SavorySecrets");
        System.out.println("11. SpiceSavants");
        System.out.println("12. TantalizingTreats");
        System.out.println("13. CooksCorner");
        System.out.println("14. FoodFusionFables");
        System.out.println("15. HomeCookedHaven");
        System.out.println("16. FlavorFiesta");
        System.out.println("17. TasteBudTales");
        System.out.println("18. EpicureanEats");
        System.out.println("19. TheCookingCompass");
        System.out.println("20. DishDelights");
        System.out.println("21. CulinaryCreatives");
        System.out.println("22. GourmetGuidance");
        System.out.println("23. FlavorsomeFables");
        System.out.println("24. KitchenKonnoisseurs");
        System.out.println("25. RecipeRhythms");
        System.out.println("26. FeastFables");
        System.out.println("27. FlavorFables");
        System.out.println("28. TastyTreasures");
        System.out.println("29. CooksCraze");
        System.out.println("30. FoodFables");
        System.out.println("31. ChefChronicler");
        System.out.println("32. GourmetGazette");
        System.out.println("33. SpiceSymphony");
        System.out.println("34. DishDiscoveries");
        System.out.println("35. CulinaryChronicles");
        System.out.println("36. FlavorfulFairytales");
        System.out.println("37. KitchenKaleidoscope");
        System.out.println("38. TasteTravellers");
        System.out.println("39. RecipeRevelations");
        System.out.println("40. DeliciousDimensions");
        System.out.println("41. FoodieFables");
        System.out.println("42. CulinaryConquests");
        System.out.println("43. FlavorFestival");
        System.out.println("44. RecipeRomance");
        System.out.println("45. KitchenQuests");
        System.out.println("46. FlavorfulFare");
        System.out.println("47. TastyTravels");
        System.out.println("48. CulinaryCraze");
        System.out.println("49. EpicureanExperiences");
        System.out.println("50. DishDiaries");
    }

    public static void suggestTravelChannels() {
        System.out.println("Names for Travel Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. WanderlustWonders");
        System.out.println("2. ExploreEverywhere");
        System.out.println("3. AdventureAlmanac");
        System.out.println("4. TravelTales");
        System.out.println("5. JourneyJunkies");
        System.out.println("6. ExpeditionEpic");
        System.out.println("7. RoamRhapsodies");
        System.out.println("8. DestinationDiaries");
        System.out.println("9. TrekkingTales");
        System.out.println("10. GlobeTrottingGurus");
        System.out.println("11. OdysseyOracles");
        System.out.println("12. DiscoverDestinations");
        System.out.println("13. WayfarerWhispers");
        System.out.println("14. PassagePioneers");
        System.out.println("15. AdventureArchive");
        System.out.println("16. RoamingRendezvous");
        System.out.println("17. TrailblazingTrips");
        System.out.println("18. TravelersTrove");
        System.out.println("19. WandererWonders");
        System.out.println("20. ExploreExpeditions");
        System.out.println("21. JourneyJournals");
        System.out.println("22. GlobalAdventurers");
        System.out.println("23. RoamersRealm");
        System.out.println("24. TripTales");
        System.out.println("25. ExpeditionExplorers");
        System.out.println("26. WayfarerWanderings");
        System.out.println("27. OdysseyOutings");
        System.out.println("28. DiscoveringDestinations");
        System.out.println("29. TrekkingTales");
        System.out.println("30. GlobeTrottingGazette");
        System.out.println("31. PassagePioneers");
        System.out.println("32. AdventureArchive");
        System.out.println("33. RoamingRambles");
        System.out.println("34. TrailblazingTravels");
        System.out.println("35. TravelersTales");
        System.out.println("36. WanderingWhispers");
        System.out.println("37. ExpeditionEchelons");
        System.out.println("38. WanderlustWritings");
        System.out.println("39. OdysseyOverviews");
        System.out.println("40. ExploringEscapades");
        System.out.println("41. JourneyJottings");
        System.out.println("42. AdventurousAtlas");
        System.out.println("43. RoamingReveries");
        System.out.println("44. TrailTales");
        System.out.println("45. VoyageVisions");
        System.out.println("46. ExploreEchoes");
        System.out.println("47. TrekTravels");
        System.out.println("48. DestinationDairies");
        System.out.println("49. GlobetrotterGazette");
        System.out.println("50. PassagePilgrimages");
    }

    public static void suggestTechReviewChannels() {
        System.out.println("Names for Tech Review Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. TechWiz Reviews");
        System.out.println("2. GadgetGuruZone");
        System.out.println("3. GearGaze");
        System.out.println("4. FutureTech Insights");
        System.out.println("5. The Tech Explorer");
        System.out.println("6. DigitalDive Reviews");
        System.out.println("7. ByteBeat Reviews");
        System.out.println("8. TechnoUniverse");
        System.out.println("9. GizmoGlimpse");
        System.out.println("10. CircuitCrafters");
        System.out.println("11. GadgetGeeks Central");
        System.out.println("12. TechTrekker Reviews");
        System.out.println("13. InnovateNerd");
        System.out.println("14. The Gadget Galaxy");
        System.out.println("15. TechnoPulse");
        System.out.println("16. ByteBrilliance");
        System.out.println("17. GizmoGuide");
        System.out.println("18. TechSavvy HQ");
        System.out.println("19. GadgetGenius");
        System.out.println("20. The Geek Gazette");
        System.out.println("21. GadgetGrind Reviews");
        System.out.println("22. ByteBoulevard");
        System.out.println("23. TechnoTrailblazers");
        System.out.println("24. GadgetGlow Reviews");
        System.out.println("25. The Tech Titan");
        System.out.println("26. InnovationStation");
        System.out.println("27. GizmoGurus");
        System.out.println("28. TechnoTracks");
        System.out.println("29. GadgetGleam");
        System.out.println("30. ByteBurst Reviews");
        System.out.println("31. TechTime Travels");
        System.out.println("32. GadgetGuardians");
        System.out.println("33. GizmoGuru Reviews");
        System.out.println("34. The Tech Trove");
        System.out.println("35. InnovateInsight");
        System.out.println("36. TechnoTalk Reviews");
        System.out.println("37. GadgetGlance");
        System.out.println("38. ByteBoost Reviews");
        System.out.println("39. TechTricks and Tips");
        System.out.println("40. GadgetGateway");
        System.out.println("41. GizmoGuidance");
        System.out.println("42. TechTales Reviews");
        System.out.println("43. ByteBlitz Reviews");
        System.out.println("44. GadgetGlimmer");
        System.out.println("45. TechnoThrive Reviews");
        System.out.println("46. GizmoGold Reviews");
        System.out.println("47. GadgetGaze Insights");
        System.out.println("48. ByteBuzz Reviews");
        System.out.println("49. TechTrends Reviews");
        System.out.println("50. GadgetGravitate");
    }

    public static void suggestBeautyChannels() {
        System.out.println("Names for Beauty Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. GlamourGuru");
        System.out.println("2. BeautyBoutique");
        System.out.println("3. MakeupMasters");
        System.out.println("4. BeautyBliss");
        System.out.println("5. ChicCosmetics");
        System.out.println("6. RadiantRevive");
        System.out.println("7. AlluringArtistry");
        System.out.println("8. GlamourGuide");
        System.out.println("9. BeautyBeat");
        System.out.println("10. StyleSavvy");
        System.out.println("11. GlamourGazette");
        System.out.println("12. BeautyBoutiqueBuzz");
        System.out.println("13. MakeupMarvels");
        System.out.println("14. BeautyBlush");
        System.out.println("15. ChicCanvas");
        System.out.println("16. RadiantRituals");
        System.out.println("17. AlluringAesthetics");
        System.out.println("18. GlamourGlimpse");
        System.out.println("19. BeautyBloom");
        System.out.println("20. StyleSecrets");
        System.out.println("21. GlamourGoddess");
        System.out.println("22. BeautyBuzz");
        System.out.println("23. MakeupMagicMakers");
        System.out.println("24. BeautyBlossom");
        System.out.println("25. ChicCreations");
        System.out.println("26. RadiantRendezvous");
        System.out.println("27. AlluringAppearances");
        System.out.println("28. GlamourGallery");
        System.out.println("29. BeautyBlitz");
        System.out.println("30. StyleSculpt");
        System.out.println("31. GlamourGazette");
        System.out.println("32. BeautyBasics");
        System.out.println("33. MakeupMystique");
        System.out.println("34. BeautyBoulevard");
        System.out.println("35. ChicCharms");
        System.out.println("36. RadiantReflections");
        System.out.println("37. AllureAestheticians");
        System.out.println("38. GlamourGuidebook");
        System.out.println("39. BeautyBestow");
        System.out.println("40. StyleSymphony");
        System.out.println("41. GlamourGoddesses");
        System.out.println("42. BeautyBlitzkrieg");
        System.out.println("43. MakeupMania");
        System.out.println("44. BeautyBouquet");
        System.out.println("45. ChicCouture");
        System.out.println("46. RadiantRegimens");
        System.out.println("47. AllureArtisans");
        System.out.println("48. GlamourGazetteer");
        System.out.println("49. BeautyBloomers");
        System.out.println("50. StyleStylists");
    }

    public static void suggestDIYChannels() {
        System.out.println("Names for DIY and Craft Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. CraftyCreations");
        System.out.println("2. DIYDynasty");
        System.out.println("3. ArtisticAdventures");
        System.out.println("4. CreativeCrafters");
        System.out.println("5. HandmadeHaven");
        System.out.println("6. CraftersCorner");
        System.out.println("7. DIYDelights");
        System.out.println("8. ArtistryAvenue");
        System.out.println("9. MakersMingle");
        System.out.println("10. HandcraftedHeroes");
        System.out.println("11. CraftyCreationsCollective");
        System.out.println("12. DIYDreamscape");
        System.out.println("13. ArtisanAdventures");
        System.out.println("14. CraftersCanvas");
        System.out.println("15. HandmadeHarbor");
        System.out.println("16. DIYDesigns");
        System.out.println("17. ArtistryAtelier");
        System.out.println("18. MakersManifesto");
        System.out.println("19. CraftyChronicles");
        System.out.println("20. DIYDelightsDossier");
        System.out.println("21. ArtisanArtistry");
        System.out.println("22. CraftingConfluence");
        System.out.println("23. HandmadeHues");
        System.out.println("24. DIYDexterity");
        System.out.println("25. ArtistryAssembly");
        System.out.println("26. MakersMosaic");
        System.out.println("27. CraftyCraftsmanship");
        System.out.println("28. DIYDimensions");
        System.out.println("29. ArtisanArtscape");
        System.out.println("30. CraftingCraftworks");
        System.out.println("31. HandmadeHeritage");
        System.out.println("32. DIYDynamos");
        System.out.println("33. ArtistryArtifacts");
        System.out.println("34. MakersMarvels");
        System.out.println("35. CraftyCreationsChronicle");
        System.out.println("36. DIYDiscovery");
        System.out.println("37. ArtisanAlmanac");
        System.out.println("38. CraftingChampion");
        System.out.println("39. HandmadeHarmonies");
        System.out.println("40. DIYDeeds");
        System.out.println("41. ArtistryAnthology");
        System.out.println("42. MakersManifold");
        System.out.println("43. CraftyCreativity");
        System.out.println("44. DIYDimensionsDossier");
        System.out.println("45. ArtisanArchives");
        System.out.println("46. CraftingCraftopia");
        System.out.println("47. HandmadeHappenings");
        System.out.println("48. DIYDesignDirectory");
        System.out.println("49. ArtistryArchive");
        System.out.println("50. MakersMasterpiece");
    }

    public static void suggestFashionChannels() {
        System.out.println("Names for Fashion Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. StyleSavvy");
        System.out.println("2. FashionFusion");
        System.out.println("3. ChicCharms");
        System.out.println("4. TrendyTouches");
        System.out.println("5. GlamourGurus");
        System.out.println("6. StyleSensei");
        System.out.println("7. VogueVignettes");
        System.out.println("8. HauteHues");
        System.out.println("9. CoutureChronicles");
        System.out.println("10. EleganceEnsemble");
        System.out.println("11. ChicCatalog");
        System.out.println("12. StyleSymphony");
        System.out.println("13. GlamourGazette");
        System.out.println("14. TrendTransformers");
        System.out.println("15. FashionFables");
        System.out.println("16. CoutureChroniclesCollective");
        System.out.println("17. StyleStories");
        System.out.println("18. ChicChronicles");
        System.out.println("19. EleganceEchoes");
        System.out.println("20. VogueVault");
        System.out.println("21. GlamourGala");
        System.out.println("22. TrendyTravels");
        System.out.println("23. FashionFiesta");
        System.out.println("24. CoutureConnoisseurs");
        System.out.println("25. StyleSculpt");
        System.out.println("26. ChicCanvas");
        System.out.println("27. EleganceEncounter");
        System.out.println("28. VogueVistas");
        System.out.println("29. GlamourGuide");
        System.out.println("30. TrendyTales");
        System.out.println("31. FashionFascination");
        System.out.println("32. CoutureConfluence");
        System.out.println("33. StyleScribbles");
        System.out.println("34. ChicCreations");
        System.out.println("35. EleganceExperiences");
        System.out.println("36. VogueVortex");
        System.out.println("37. GlamourGallery");
        System.out.println("38. TrendyTreasures");
        System.out.println("39. FashionFlair");
        System.out.println("40. CoutureCanvas");
        System.out.println("41. StyleSplendors");
        System.out.println("42. ChicChronicle");
        System.out.println("43. EleganceEscapades");
        System.out.println("44. VogueVagabonds");
        System.out.println("45. GlamourGlimpse");
        System.out.println("46. TrendyTrailblazers");
        System.out.println("47. FashionFestival");
        System.out.println("48. CoutureCraze");
        System.out.println("49. StyleSaga");
        System.out.println("50. ChicConnoisseurs");
    }

    public static void suggestHealthChannels() {
        System.out.println("Names for Health Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. FitnessFusion");
        System.out.println("2. HealthHaven");
        System.out.println("3. WellnessWonders");
        System.out.println("4. ActiveAdventures");
        System.out.println("5. WorkoutWorld");
        System.out.println("6. FitFables");
        System.out.println("7. WellnessWizards");
        System.out.println("8. HealthHarbor");
        System.out.println("9. FitnessFiesta");
        System.out.println("10. WellnessWhispers");
        System.out.println("11. BodyBoost");
        System.out.println("12. MindfulMovements");
        System.out.println("13. ActiveAchievers");
        System.out.println("14. WellnessWell");
        System.out.println("15. FitnessFlair");
        System.out.println("16. HealthHeroes");
        System.out.println("17. FitFablesCollective");
        System.out.println("18. WellnessWays");
        System.out.println("19. WorkoutWonders");
        System.out.println("20. WellnessWave");
        System.out.println("21. FitnessFables");
        System.out.println("22. HealthHarmony");
        System.out.println("23. WellnessWardens");
        System.out.println("24. ActiveAdmirers");
        System.out.println("25. WellnessWays");
        System.out.println("26. FitnessForLife");
        System.out.println("27. HealthHues");
        System.out.println("28. WellnessWanderers");
        System.out.println("29. FitFablesChronicle");
        System.out.println("30. ActiveAdventures");
        System.out.println("31. WellnessWonders");
        System.out.println("32. WellnessWhispers");
        System.out.println("33. FitnessFables");
        System.out.println("34. HealthHaven");
        System.out.println("35. WellnessWizards");
        System.out.println("36. WorkoutWellness");
        System.out.println("37. FitFablesCollective");
        System.out.println("38. WellnessWays");
        System.out.println("39. FitnessFiesta");
        System.out.println("40. HealthHarbor");
        System.out.println("41. WellnessFlavors");
        System.out.println("42. ActiveAdventures");
        System.out.println("43. WellnessWhispers");
        System.out.println("44. FitFables");
        System.out.println("45. HealthHeroes");
        System.out.println("46. WellnessWonders");
        System.out.println("47. WellnessWell");
        System.out.println("48. FitnessFlair");
        System.out.println("49. HealthHues");
        System.out.println("50. WellnessWizards");
    }

    public static void suggestComedyChannels() {
        System.out.println("Names for Comedy Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. ComedyCentral");
        System.out.println("2. LaughLounge");
        System.out.println("3. HilariousHaven");
        System.out.println("4. FunnyFables");
        System.out.println("5. ComedyCarnival");
        System.out.println("6. GiggleGallery");
        System.out.println("7. ChuckleChamber");
        System.out.println("8. JokesJunction");
        System.out.println("9. GuffawGalore");
        System.out.println("10. HumorHub");
        System.out.println("11. ComedyCarousel");
        System.out.println("12. LaughLand");
        System.out.println("13. HilarityHarbor");
        System.out.println("14. WittyWonders");
        System.out.println("15. ComedyCorner");
        System.out.println("16. AmusingAdventures");
        System.out.println("17. FunnyFrenzy");
        System.out.println("18. GiggleGenius");
        System.out.println("19. ComedyCollective");
        System.out.println("20. LaughterLounge");
        System.out.println("21. HilariousHideout");
        System.out.println("22. JokesJamboree");
        System.out.println("23. ChuckleCharm");
        System.out.println("24. ComedyCabaret");
        System.out.println("25. GiggleGallery");
        System.out.println("26. HumorHaven");
        System.out.println("27. ComedyCircus");
        System.out.println("28. LaughLand");
        System.out.println("29. HilarityHarbor");
        System.out.println("30. FunnyFables");
        System.out.println("31. GuffawGalore");
        System.out.println("32. ComedyCarousel");
        System.out.println("33. JokesJunction");
        System.out.println("34. ChuckleChamber");
        System.out.println("35. LaughLounge");
        System.out.println("36. HilariousHaven");
        System.out.println("37. WittyWonders");
        System.out.println("38. ComedyCarnival");
        System.out.println("39. GiggleGenius");
        System.out.println("40. FunnyFrenzy");
        System.out.println("41. HumorHub");
        System.out.println("42. ComedyCollective");
        System.out.println("43. LaughterLand");
        System.out.println("44. HilarityHideout");
        System.out.println("45. JokesJamboree");
        System.out.println("46. ChuckleCharm");
        System.out.println("47. ComedyCabaret");
        System.out.println("48. GiggleGallery");
        System.out.println("49. LaughLand");
        System.out.println("50. HilariousHarbor");
    }

    public static void suggestEducationalChannels() {
        System.out.println("Names for Education Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. EduInsights");
        System.out.println("2. LearnLighthouse");
        System.out.println("3. KnowledgeKaleidoscope");
        System.out.println("4. AcademicAlliance");
        System.out.println("5. StudySpectrum");
        System.out.println("6. ScholarlySpotlight");
        System.out.println("7. EduEnlighten");
        System.out.println("8. LearningLighthouse");
        System.out.println("9. WisdomWorkshop");
        System.out.println("10. IntellectInnovators");
        System.out.println("11. EduExplorers");
        System.out.println("12. EnlightenedEducation");
        System.out.println("13. StudySolutions");
        System.out.println("14. KnowledgeKingdom");
        System.out.println("15. AcademicAdventures");
        System.out.println("16. LearnLab");
        System.out.println("17. ScholarlyShowcase");
        System.out.println("18. EduEdifice");
        System.out.println("19. LearningLegacy");
        System.out.println("20. MindMentors");
        System.out.println("21. EduExcellence");
        System.out.println("22. WisdomWonders");
        System.out.println("23. IntellectualInsights");
        System.out.println("24. StudySafari");
        System.out.println("25. KnowledgeKorner");
        System.out.println("26. AcademicAscent");
        System.out.println("27. LearnLexicon");
        System.out.println("28. ScholarlySculptors");
        System.out.println("29. EduElevate");
        System.out.println("30. LearningLandmarks");
        System.out.println("31. EduExplorers");
        System.out.println("32. KnowledgeKaleidoscope");
        System.out.println("33. AcademicAlliance");
        System.out.println("34. StudySpectrum");
        System.out.println("35. ScholarlySpotlight");
        System.out.println("36. EduEnlighten");
        System.out.println("37. LearningLighthouse");
        System.out.println("38. WisdomWorkshop");
        System.out.println("39. IntellectInnovators");
        System.out.println("40. EduEdifice");
        System.out.println("41. LearningLegacy");
        System.out.println("42. MindMentors");
        System.out.println("43. EduExcellence");
        System.out.println("44. WisdomWonders");
        System.out.println("45. IntellectualInsights");
        System.out.println("46. StudySolutions");
        System.out.println("47. KnowledgeKingdom");
        System.out.println("48. AcademicAdventures");
        System.out.println("49. LearnLab");
        System.out.println("50. ScholarlyShowcase");
    }

    public static void suggestMusicChannels() {
        System.out.println("Names for Music Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. MelodicMasterpiece");
        System.out.println("2. MusicalMoods");
        System.out.println("3. RhythmicReverie");
        System.out.println("4. HarmonicHarbor");
        System.out.println("5. SoundSculptors");
        System.out.println("6. TuneTales");
        System.out.println("7. MusicMagic");
        System.out.println("8. Songsmiths");
        System.out.println("9. VocalVibes");
        System.out.println("10. HarmoniousHarbor");
        System.out.println("11. MelodyMakers");
        System.out.println("12. SonicSymphony");
        System.out.println("13. RhythmRevelry");
        System.out.println("14. HarmonyHaven");
        System.out.println("15. SoundSculpture");
        System.out.println("16. TuneTalesCollective");
        System.out.println("17. MusicMasters");
        System.out.println("18. SongsmithSociety");
        System.out.println("19. VocalVirtuosos");
        System.out.println("20. HarmonicHarborCollective");
        System.out.println("21. MelodicMelodies");
        System.out.println("22. SonicSoundscapes");
        System.out.println("23. RhythmicRhapsody");
        System.out.println("24. HarmoniousHues");
        System.out.println("25. SoundSculptorsCollective");
        System.out.println("26. TuneTalesTales");
        System.out.println("27. MusicMania");
        System.out.println("28. SongsmithSymphony");
        System.out.println("29. VocalVibesVoyage");
        System.out.println("30. HarmonicHarborHarmony");
        System.out.println("31. MelodicMasters");
        System.out.println("32. SonicSensation");
        System.out.println("33. RhythmicRendezvous");
        System.out.println("34. HarmonyHighlights");
        System.out.println("35. SoundSculptureSociety");
        System.out.println("36. TuneTalesChronicle");
        System.out.println("37. MusicMagicMelodies");
        System.out.println("38. SongsmithSerenade");
        System.out.println("39. VocalVirtuosoVoyage");
        System.out.println("40. HarmonicHarborHarmonies");
        System.out.println("41. MelodicMelodiesCollective");
        System.out.println("42. SonicSymphonySounds");
        System.out.println("43. RhythmReverie");
        System.out.println("44. HarmoniousHarborHarmonies");
        System.out.println("45. SoundSculptorsSymphony");
        System.out.println("46. TuneTalesTunes");
        System.out.println("47. MusicManiaMelodies");
        System.out.println("48. SongsmithSonic");
        System.out.println("49. VocalVibesVoyage");
        System.out.println("50. HarmonicHarborHarmony");
    }

    public static void suggestUnboxingChannels() {
        System.out.println("Names for Unboxing Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. GadgetUnbox");
        System.out.println("2. UnboxTech");
        System.out.println("3. GadgetGlimpse");
        System.out.println("4. GadgetRave");
        System.out.println("5. UnboxWonders");
        System.out.println("6. GadgetGeeks");
        System.out.println("7. TechTreasures");
        System.out.println("8. GadgetGrind");
        System.out.println("9. GadgetInnovate");
        System.out.println("10. UnboxEnsemble");
        System.out.println("11. GadgetGlance");
        System.out.println("12. UnboxUniverse");
        System.out.println("13. GadgetGuru");
        System.out.println("14. TechTales");
        System.out.println("15. GadgetGalaxy");
        System.out.println("16. UnboxDelights");
        System.out.println("17. GadgetGenius");
        System.out.println("18. GadgetGuide");
        System.out.println("19. TechTrends");
        System.out.println("20. GadgetGuardians");
        System.out.println("21. UnboxEmporium");
        System.out.println("22. GadgetGold");
        System.out.println("23. GadgetGaze");
        System.out.println("24. TechInsights");
        System.out.println("25. GadgetGurus");
        System.out.println("26. UnboxWondersCollective");
        System.out.println("27. GadgetGateway");
        System.out.println("28. GadgetGreatness");
        System.out.println("29. TechTalk");
        System.out.println("30. GadgetGleam");
        System.out.println("31. UnboxEnlighten");
        System.out.println("32. GadgetGlory");
        System.out.println("33. GadgetGallery");
        System.out.println("34. TechTreasuresChronicle");
        System.out.println("35. GadgetGazeCollective");
        System.out.println("36. GadgetGrandeur");
        System.out.println("37. TechTricks");
        System.out.println("38. GadgetGuidebook");
        System.out.println("39. GadgetGoodies");
        System.out.println("40. TechTalkCollective");
        System.out.println("41. GadgetGlimpseGalore");
        System.out.println("42. GadgetGurusGuild");
        System.out.println("43. TechInsightsChronicle");
        System.out.println("44. GadgetGlanceGems");
        System.out.println("45. GadgetGalleryGuild");
        System.out.println("46. TechTreasuresChronicle");
        System.out.println("47. GadgetGazeCollective");
        System.out.println("48. GadgetGrandeur");
        System.out.println("49. TechTricks");
        System.out.println("50. GadgetGuidebook");
    }

    public static void suggestBookChannels() {
        System.out.println("Names for Book Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. BookBuzz");
        System.out.println("2. LiteraryLegends");
        System.out.println("3. ReadRendezvous");
        System.out.println("4. PageTurners");
        System.out.println("5. BookwormsDelight");
        System.out.println("6. LiteratureLovers");
        System.out.println("7. BookishBliss");
        System.out.println("8. BookReviewBoulevard");
        System.out.println("9. ReadingRealm");
        System.out.println("10. LiteratureLighthouse");
        System.out.println("11. BookWanderers");
        System.out.println("12. LiteraryLandmarks");
        System.out.println("13. ChapterChat");
        System.out.println("14. ReadRevival");
        System.out.println("15. BookNook");
        System.out.println("16. NovelNest");
        System.out.println("17. BookwormsGather");
        System.out.println("18. LiteraryLounge");
        System.out.println("19. PagePerspectives");
        System.out.println("20. BookHaven");
        System.out.println("21. LiteratureLabyrinth");
        System.out.println("22. BookwormsWorld");
        System.out.println("23. ReadingReviews");
        System.out.println("24. BibliophileBliss");
        System.out.println("25. BookReviewRealm");
        System.out.println("26. LiteraryLandscapes");
        System.out.println("27. ChapterChronicle");
        System.out.println("28. ReadReflections");
        System.out.println("29. BookBrowse");
        System.out.println("30. NovelNestCollective");
        System.out.println("31. BookwormsUnite");
        System.out.println("32. LiteraryLibrary");
        System.out.println("33. PagePleasures");
        System.out.println("34. BookHavenHarbor");
        System.out.println("35. LiteratureLoversCollective");
        System.out.println("36. BookishGems");
        System.out.println("37. BookReviewBoulevardGuild");
        System.out.println("38. ReadingRealmsChronicle");
        System.out.println("39. BibliophileBoulevard");
        System.out.println("40. BookReviewReverie");
        System.out.println("41. LiteraryJourney");
        System.out.println("42. PagePerspectivesCollective");
        System.out.println("43. BookHavenHarborHarmony");
        System.out.println("44. LiteratureLoversLand");
        System.out.println("45. BookishBlissGuild");
        System.out.println("46. LiteraryLuminaries");
        System.out.println("47. ReadRevivalChronicle");
        System.out.println("48. BookNookGuild");
        System.out.println("49. NovelNook");
        System.out.println("50. BookwormsDelightCollective");
    }

    public static void suggestMotivationChannels() {
        System.out.println("Names for Motivation Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. MotivateMasters");
        System.out.println("2. SelfHelpSages");
        System.out.println("3. InspireInsights");
        System.out.println("4. LifeLeadership");
        System.out.println("5. PersonalGrowthGuidance");
        System.out.println("6. SuccessStories");
        System.out.println("7. EmpowermentEncounter");
        System.out.println("8. MotivationMatrix");
        System.out.println("9. SelfDevelopmentSquad");
        System.out.println("10. InnerStrengthInc");
        System.out.println("11. MotivateManifest");
        System.out.println("12. AchievementAvenue");
        System.out.println("13. DriveYourDreams");
        System.out.println("14. LifeMasteryMission");
        System.out.println("15. InspireImpact");
        System.out.println("16. EmpowermentExpress");
        System.out.println("17. MotivationMomentum");
        System.out.println("18. SelfGrowthGurus");
        System.out.println("19. SuccessSculptors");
        System.out.println("20. MotivateMentors");
        System.out.println("21. MindsetMakeover");
        System.out.println("22. ElevateEndeavors");
        System.out.println("23. LifeLeaders");
        System.out.println("24. InspireInsightCollective");
        System.out.println("25. EmpowermentEnsemble");
        System.out.println("26. MotivationMastersGuild");
        System.out.println("27. SelfHelpHeroes");
        System.out.println("28. SuccessStrategies");
        System.out.println("29. InnerChampionChase");
        System.out.println("30. MotivationMatrixCollective");
        System.out.println("31. PersonalEmpowermentGuild");
        System.out.println("32. LifeMasteryMissionMakers");
        System.out.println("33. InspireImpactCollective");
        System.out.println("34. EmpowermentEncounterEnsemble");
        System.out.println("35. MotivationManifestGuild");
        System.out.println("36. SelfGrowthSages");
        System.out.println("37. SuccessSculptorsGuild");
        System.out.println("38. MotivateMentorsCollective");
        System.out.println("39. MindsetMakeoverMasters");
        System.out.println("40. LifeLeadersGuild");
        System.out.println("41. InspireInsightCollective");
        System.out.println("42. EmpowermentExpressEnsemble");
        System.out.println("43. MotivationMomentumGuild");
        System.out.println("44. SelfHelpHeroesGuild");
        System.out.println("45. SuccessStrategiesCollective");
        System.out.println("46. InnerChampionChaseGuild");
        System.out.println("47. MotivationMatrixCollective");
        System.out.println("48. PersonalEmpowermentGuild");
        System.out.println("49. LifeMasteryMissionMakersGuild");
        System.out.println("50. InspireImpactCollective");
    }

    public static void suggestParentingChannels() {
        System.out.println("Names for Parenting Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. ParentingPioneers");
        System.out.println("2. FamilyFirstVlogs");
        System.out.println("3. ChildRearingChronicle");
        System.out.println("4. ParenthoodPassport");
        System.out.println("5. FamilyFables");
        System.out.println("6. RaisingRoyals");
        System.out.println("7. ParentingPerspectives");
        System.out.println("8. FamilyFocusFridays");
        System.out.println("9. JoyfulJourneys");
        System.out.println("10. ParentingParadise");
        System.out.println("11. FamilyAdventures");
        System.out.println("12. ParentingPostcards");
        System.out.println("13. FamilyTales");
        System.out.println("14. ParentingPilgrimage");
        System.out.println("15. FamilyFablesCollective");
        System.out.println("16. ChildRearingChronicleGuild");
        System.out.println("17. ParenthoodPassportAdventures");
        System.out.println("18. FamilyFocusFridaysCollective");
        System.out.println("19. JoyfulJourneysGuild");
        System.out.println("20. ParentingParadiseAdventures");
        System.out.println("21. FamilyAdventuresCollective");
        System.out.println("22. ParentingPostcardsJourney");
        System.out.println("23. FamilyTalesChronicle");
        System.out.println("24. ParentingPilgrimageCollective");
        System.out.println("25. FamilyAdventuresGuild");
        System.out.println("26. ParentingPostcardsCollective");
        System.out.println("27. FamilyTalesJourney");
        System.out.println("28. ParentingPilgrimageChronicle");
        System.out.println("29. FamilyAdventuresChronicle");
        System.out.println("30. ParentingPostcardsGuild");
        System.out.println("31. FamilyTalesGuild");
        System.out.println("32. ParentingPilgrimageJourney");
        System.out.println("33. FamilyAdventuresJourney");
        System.out.println("34. ParentingPostcardsChronicle");
        System.out.println("35. FamilyTalesChronicleGuild");
        System.out.println("36. ParentingPilgrimageGuild");
        System.out.println("37. FamilyAdventuresGuildCollective");
        System.out.println("38. ParentingPostcardsJourneyCollective");
        System.out.println("39. FamilyTalesChronicleCollective");
        System.out.println("40. ParentingPilgrimageJourneyCollective");
        System.out.println("41. FamilyAdventuresJourneyCollective");
        System.out.println("42. ParentingPostcardsChronicleCollective");
        System.out.println("43. FamilyTalesChronicleGuildCollective");
        System.out.println("44. ParentingPilgrimageGuildCollective");
        System.out.println("45. FamilyAdventuresGuildCollective");
        System.out.println("46. ParentingPostcardsJourneyCollective");
        System.out.println("47. FamilyTalesChronicleCollective");
        System.out.println("48. ParentingPilgrimageJourneyCollective");
        System.out.println("49. FamilyAdventuresJourneyCollective");
        System.out.println("50. ParentingPostcardsChronicleCollective");
    }

    public static void suggestPetChannels() {
        System.out.println("Names for Pet Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. PetPalsParadise");
        System.out.println("2. AnimalAdventures");
        System.out.println("3. WildlifeWonders");
        System.out.println("4. FurryFriendsFables");
        System.out.println("5. PetPamperingPioneers");
        System.out.println("6. CritterChronicles");
        System.out.println("7. PetTales");
        System.out.println("8. AnimalAntics");
        System.out.println("9. PawsAndWhiskersWorld");
        System.out.println("10. PetParadise");
        System.out.println("11. AnimalAdventuresGuild");
        System.out.println("12. WildlifeWondersCollective");
        System.out.println("13. FurryFriendsFablesGuild");
        System.out.println("14. PetPamperingPioneersGuild");
        System.out.println("15. CritterChroniclesCollective");
        System.out.println("16. PetTalesGuild");
        System.out.println("17. AnimalAnticsCollective");
        System.out.println("18. PawsAndWhiskersWorldGuild");
        System.out.println("19. PetParadiseCollective");
        System.out.println("20. AnimalAdventuresChronicle");
        System.out.println("21. WildlifeWondersGuild");
        System.out.println("22. FurryFriendsFablesChronicle");
        System.out.println("23. PetPamperingPioneersChronicle");
        System.out.println("24. CritterChroniclesGuild");
        System.out.println("25. PetTalesChronicle");
        System.out.println("26. AnimalAnticsGuild");
        System.out.println("27. PawsAndWhiskersWorldChronicle");
        System.out.println("28. PetParadiseChronicle");
        System.out.println("29. AnimalAdventuresJourney");
        System.out.println("30. WildlifeWondersChronicle");
        System.out.println("31. FurryFriendsFablesJourney");
        System.out.println("32. PetPamperingPioneersJourney");
        System.out.println("33. CritterChroniclesChronicle");
        System.out.println("34. PetTalesJourney");
        System.out.println("35. AnimalAnticsChronicle");
        System.out.println("36. PawsAndWhiskersWorldJourney");
        System.out.println("37. PetParadiseJourney");
        System.out.println("38. AnimalAdventuresGuildCollective");
        System.out.println("39. WildlifeWondersGuildCollective");
        System.out.println("40. FurryFriendsFablesGuildCollective");
        System.out.println("41. PetPamperingPioneersGuildCollective");
        System.out.println("42. CritterChroniclesGuildCollective");
        System.out.println("43. PetTalesGuildCollective");
        System.out.println("44. AnimalAnticsGuildCollective");
        System.out.println("45. PawsAndWhiskersWorldGuildCollective");
        System.out.println("46. PetParadiseGuildCollective");
        System.out.println("47. AnimalAdventuresChronicleCollective");
        System.out.println("48. WildlifeWondersChronicleCollective");
        System.out.println("49. FurryFriendsFablesChronicleCollective");
        System.out.println("50. PetPamperingPioneersChronicleCollective");
    }

    public static void suggestFinanceChannels() {
        System.out.println("Names for Finance Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. FinanceFacts");
        System.out.println("2. InvestmentInsights");
        System.out.println("3. MoneyMattersMaster");
        System.out.println("4. WealthWizards");
        System.out.println("5. FinancialFortuneForum");
        System.out.println("6. InvestSmartSolutions");
        System.out.println("7. WealthWisdomGuild");
        System.out.println("8. MoneyManagementMentors");
        System.out.println("9. FinanceFactsCollective");
        System.out.println("10. InvestmentInsightsGuild");
        System.out.println("11. MoneyMattersMasterCollective");
        System.out.println("12. WealthWizardsGuild");
        System.out.println("13. FinancialFortuneForumCollective");
        System.out.println("14. InvestSmartSolutionsGuild");
        System.out.println("15. WealthWisdomGuildCollective");
        System.out.println("16. MoneyManagementMentorsGuild");
        System.out.println("17. FinanceFactsChronicle");
        System.out.println("18. InvestmentInsightsChronicle");
        System.out.println("19. MoneyMattersMasterChronicle");
        System.out.println("20. WealthWizardsChronicle");
        System.out.println("21. FinancialFortuneForumChronicle");
        System.out.println("22. InvestSmartSolutionsChronicle");
        System.out.println("23. WealthWisdomChronicle");
        System.out.println("24. MoneyManagementMentorsChronicle");
        System.out.println("25. FinanceFactsGuildCollective");
        System.out.println("26. InvestmentInsightsGuildCollective");
        System.out.println("27. MoneyMattersMasterGuildCollective");
        System.out.println("28. WealthWizardsGuildCollective");
        System.out.println("29. FinancialFortuneForumGuildCollective");
        System.out.println("30. InvestSmartSolutionsGuildCollective");
        System.out.println("31. WealthWisdomGuildCollective");
        System.out.println("32. MoneyManagementMentorsGuildCollective");
        System.out.println("33. FinanceFactsChronicleCollective");
        System.out.println("34. InvestmentInsightsChronicleCollective");
        System.out.println("35. MoneyMattersMasterChronicleCollective");
        System.out.println("36. WealthWizardsChronicleCollective");
        System.out.println("37. FinancialFortuneForumChronicleCollective");
        System.out.println("38. InvestSmartSolutionsChronicleCollective");
        System.out.println("39. WealthWisdomChronicleCollective");
        System.out.println("40. MoneyManagementMentorsChronicleCollective");
        System.out.println("41. FinanceFactsGuildCollectiveGuild");
        System.out.println("42. InvestmentInsightsGuildCollectiveGuild");
        System.out.println("43. MoneyMattersMasterGuildCollectiveGuild");
        System.out.println("44. WealthWizardsGuildCollectiveGuild");
        System.out.println("45. FinancialFortuneForumGuildCollectiveGuild");
        System.out.println("46. InvestSmartSolutionsGuildCollectiveGuild");
        System.out.println("47. WealthWisdomGuildCollectiveGuild");
        System.out.println("48. MoneyManagementMentorsGuildCollectiveGuild");
        System.out.println("49. FinanceFactsChronicleCollectiveGuild");
        System.out.println("50. InvestmentInsightsChronicleCollectiveGuild");
    }

    public static void suggestScienceChannels() {
        System.out.println("Names for Science Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. ScienceSimplified");
        System.out.println("2. TechTalkExplorers");
        System.out.println("3. DiscoveringScience");
        System.out.println("4. TechnoTraverse");
        System.out.println("5. TheScienceSpotlight");
        System.out.println("6. TechTalesandTidbits");
        System.out.println("7. ScienceSecretsUnveiled");
        System.out.println("8. TechExplainedInDepth");
        System.out.println("9. ScienceSimplifiedGuild");
        System.out.println("10. TechTalkExplorersGuild");
        System.out.println("11. DiscoveringScienceCollective");
        System.out.println("12. TechnoTraverseGuild");
        System.out.println("13. TheScienceSpotlightCollective");
        System.out.println("14. TechTalesandTidbitsGuild");
        System.out.println("15. ScienceSecretsUnveiledGuild");
        System.out.println("16. TechExplainedInDepthGuild");
        System.out.println("17. ScienceSimplifiedChronicle");
        System.out.println("18. TechTalkExplorersChronicle");
        System.out.println("19. DiscoveringScienceChronicle");
        System.out.println("20. TechnoTraverseChronicle");
        System.out.println("21. TheScienceSpotlightChronicle");
        System.out.println("22. TechTalesandTidbitsChronicle");
        System.out.println("23. ScienceSecretsUnveiledChronicle");
        System.out.println("24. TechExplainedInDepthChronicle");
        System.out.println("25. ScienceSimplifiedGuildCollective");
        System.out.println("26. TechTalkExplorersGuildCollective");
        System.out.println("27. DiscoveringScienceGuildCollective");
        System.out.println("28. TechnoTraverseGuildCollective");
        System.out.println("29. TheScienceSpotlightGuildCollective");
        System.out.println("30. TechTalesandTidbitsGuildCollective");
        System.out.println("31. ScienceSecretsUnveiledGuildCollective");
        System.out.println("32. TechExplainedInDepthGuildCollective");
        System.out.println("33. ScienceSimplifiedChronicleCollective");
        System.out.println("34. TechTalkExplorersChronicleCollective");
        System.out.println("35. DiscoveringScienceChronicleCollective");
        System.out.println("36. TechnoTraverseChronicleCollective");
        System.out.println("37. TheScienceSpotlightChronicleCollective");
        System.out.println("38. TechTalesandTidbitsChronicleCollective");
        System.out.println("39. ScienceSecretsUnveiledChronicleCollective");
        System.out.println("40. TechExplainedInDepthChronicleCollective");
        System.out.println("41. ScienceSimplifiedGuildCollectiveGuild");
        System.out.println("42. TechTalkExplorersGuildCollectiveGuild");
        System.out.println("43. DiscoveringScienceGuildCollectiveGuild");
        System.out.println("44. TechnoTraverseGuildCollectiveGuild");
        System.out.println("45. TheScienceSpotlightGuildCollectiveGuild");
        System.out.println("46. TechTalesandTidbitsGuildCollectiveGuild");
        System.out.println("47. ScienceSecretsUnveiledGuildCollectiveGuild");
        System.out.println("48. TechExplainedInDepthGuildCollectiveGuild");
        System.out.println("49. ScienceSimplifiedChronicleCollectiveGuild");
        System.out.println("50. TechTalkExplorersChronicleCollectiveGuild");
    }

    public static void suggestParanormalChannels() {
        System.out.println("Names for Paranormal Channel Category: ");

        // Enpty line break
        System.out.println();

        System.out.println("1. ParanormalPuzzles");
        System.out.println("2. MysteriesUnveiled");
        System.out.println("3. EnigmaticEnigmas");
        System.out.println("4. GhostlyAdventures");
        System.out.println("5. HauntingHistories");
        System.out.println("6. MysteriousMyths");
        System.out.println("7. EerieExplorations");
        System.out.println("8. SupernaturalSleuths");
        System.out.println("9. ParanormalPuzzlesGuild");
        System.out.println("10. MysteriesUnveiledGuild");
        System.out.println("11. EnigmaticEnigmasGuild");
        System.out.println("12. GhostlyAdventuresGuild");
        System.out.println("13. HauntingHistoriesGuild");
        System.out.println("14. MysteriousMythsGuild");
        System.out.println("15. EerieExplorationsGuild");
        System.out.println("16. SupernaturalSleuthsGuild");
        System.out.println("17. ParanormalPuzzlesChronicle");
        System.out.println("18. MysteriesUnveiledChronicle");
        System.out.println("19. EnigmaticEnigmasChronicle");
        System.out.println("20. GhostlyAdventuresChronicle");
        System.out.println("21. HauntingHistoriesChronicle");
        System.out.println("22. MysteriousMythsChronicle");
        System.out.println("23. EerieExplorationsChronicle");
        System.out.println("24. SupernaturalSleuthsChronicle");
        System.out.println("25. ParanormalPuzzlesGuildCollective");
        System.out.println("26. MysteriesUnveiledGuildCollective");
        System.out.println("27. EnigmaticEnigmasGuildCollective");
        System.out.println("28. GhostlyAdventuresGuildCollective");
        System.out.println("29. HauntingHistoriesGuildCollective");
        System.out.println("30. MysteriousMythsGuildCollective");
        System.out.println("31. EerieExplorationsGuildCollective");
        System.out.println("32. SupernaturalSleuthsGuildCollective");
        System.out.println("33. ParanormalPuzzlesChronicleCollective");
        System.out.println("34. MysteriesUnveiledChronicleCollective");
        System.out.println("35. EnigmaticEnigmasChronicleCollective");
        System.out.println("36. GhostlyAdventuresChronicleCollective");
        System.out.println("37. HauntingHistoriesChronicleCollective");
        System.out.println("38. MysteriousMythsChronicleCollective");
        System.out.println("39. EerieExplorationsChronicleCollective");
        System.out.println("40. SupernaturalSleuthsChronicleCollective");
        System.out.println("41. ParanormalPuzzlesGuildCollectiveGuild");
        System.out.println("42. MysteriesUnveiledGuildCollectiveGuild");
        System.out.println("43. EnigmaticEnigmasGuildCollectiveGuild");
        System.out.println("44. GhostlyAdventuresGuildCollectiveGuild");
        System.out.println("45. HauntingHistoriesGuildCollectiveGuild");
        System.out.println("46. MysteriousMythsGuildCollectiveGuild");
        System.out.println("47. EerieExplorationsGuildCollectiveGuild");
        System.out.println("48. SupernaturalSleuthsGuildCollectiveGuild");
        System.out.println("49. ParanormalPuzzlesChronicleCollectiveGuild");
        System.out.println("50. MysteriesUnveiledChronicleCollectiveGuild");
    }
}
