package pixLab.classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Kadin Hatchell 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void keepOnlyBlue()
  {
	 Picture beach = new Picture("beach.jpg");
	 beach.explore();
	 beach.keepOnlyBlue();
	 beach.explore();
	  
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.mirrorVerticalRightToLeft();
	  koala.explore();
	  koala.zeroBlue();
	  koala.explore();
	  
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture koala = new Picture("thruDoor.jpg");
	  koala.explore();
	  koala.mirrorHorizontalBottomToTop();
	  koala.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("Temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.edgeDetection2(10);
	  swan.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.dupe();
	  snowman.explore();
  }
  
  public static void testNegate()
  {
	  Picture flower = new Picture("CumberlandIsland.jpg");
	  flower.negate();
	  flower.explore();
  }
  
  public static void oneImageFiveFilters()
  {
	  Picture star = new Picture("starWarsLogo.jpg");
	  star.negate();
	  star.mirrorHorizontalBottomToTop();
	  star.mirrorVerticalRightToLeft();
	  star.zeroBlue();
	  star.negate();
	  star.write("ultraStarWars.jpg");
	 
	  
  } 
  
  public static void testGlitchArt()
  {
	  Picture Korn = new Picture("Korn_OG.jpg");
	  Korn.glitchArt();
	  Korn.explore();
	  Korn.write("KornGlitch.jpg");
  }
  
  public static void testValMeme()
  {
	  Picture val = new Picture("backgroundredboba.png");
	  val.addMessage("Are you a double?", 100, 150);
	  val.addMessage("Cause thought of you always", 100, 200);
	  val.addMessage("Floats in my head.", 100, 250);
	  val.addMessage("To: ", 100, 400);
	  val.addMessage("From: ", 100, 500);
	  val.write("valinBoba.png");
	  val.explore();
	  

	  
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
	//testMirrorHorizontalBottomToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//keepOnlyBlue();
	//oneImageFiveFilters();
	//testValMeme();
	  testGlitchArt();
  }
}