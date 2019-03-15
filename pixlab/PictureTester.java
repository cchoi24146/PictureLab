/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
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
  
  
  /*
   * Chris Choi's Changes
   */
  public static void testKeepOnlyBlue() 
  {
   Picture beach = new Picture("beach.jpg");
   
   beach.keepOnlyBlue();
   beach.explore();
  }
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }  

  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }  

  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }    
  
  public static void testMirrorDiagonal() 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();   
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }  
    
  public static void testNegate() 
  {
   Picture beach = new Picture("water.jpg");
   
   beach.negate();
   beach.explore();
  } 
  
  public static void testMirrorGull()
  {
   Picture seagull = new Picture("seagull.jpg");
   seagull.explore();
   seagull.mirrorGull();
   seagull.explore();
   }
  
  public static void testCopy()
  {
   Picture seagull = new Picture("seagull.jpg");
   Picture canvas = new Picture("beach.jpg");
   
   seagull.copy(seagull, 50, 70, 224, 224, 333, 355);
   seagull.copy(seagull, 60, 90, 224, 224, 333, 355);
   seagull.copy(seagull, 100, 220, 224, 224, 333, 355);
   seagull.copy(seagull, 222, 333, 224, 224, 333, 355);
   seagull.copy(seagull, 60, 80, 224, 224, 333, 355);
   seagull.copy(seagull, 50, 120, 224, 224, 333, 355);
   seagull.copy(seagull, 234, 67, 224, 224, 333, 355);
   seagull.copy(seagull, 256, 54, 224, 224, 333, 355);
   seagull.copy(seagull, 23, 48, 224, 224, 333, 355);
   seagull.copy(seagull, 53, 19, 224, 224, 333, 355);
   seagull.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    //testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testMirrorDiagonal();
    //testCollage();
    testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}