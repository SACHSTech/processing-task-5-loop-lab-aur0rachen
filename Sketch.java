import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    // declare variables
    int intX = 0;
    int intY = 0;

    // calculate coordinates 
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 3 + intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        // draw squares
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    // declare variables
    int intX = 0;
    int intY = 0;
    int intColor;

    // calculate coordinates
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 300 + 3 + intRow;
        intY = 300 + 3 + intColumn;

        // determine color
        if((intRow / 10) % 2 == 0){
          intColor = 255;
        }
        else{
          intColor = 0;
        }

        // draw squares
        noStroke();
        fill(intColor);
        rect(intX, intY, 5, 5);
      } 
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
      
  public void draw_section3(){
    // declare variables
    int intX = 0;
    int intY = 0;
    int intColor;

    // calculate coordinates
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 600 + 3 + intRow;
        intY = 300 + 3 + intColumn;

        // determine color
        if((intColumn / 10) % 2 != 0){
          intColor = 255;
        }
        else{
          intColor = 0;
        }

        // draw squares
        noStroke();
        fill(intColor);
        rect(intX, intY, 5, 5);
      } 
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    // declare variables
    int intX = 0;
    int intY = 0;
    int intColor;

    // calculate coordinates
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 900 + 3 + intRow;
        intY = 300 + 3 + intColumn;

        // determine color
        if((intColumn / 10) % 2 != 0 && (intRow / 10) % 2 == 0){
          intColor = 255;
        }
        else{
          intColor = 0;
        }

        // draw squares
        noStroke();
        fill(intColor);
        rect(intX, intY, 5, 5);
      } 
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    // declare variables
    int intX = 0;
    int intY = 0;

    // calculate coordinates
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 300 - intColumn; intRow < 300; intRow += 10){
        intX = 3 + intRow;
        intY = 3 + intColumn;

        // draw squares
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section6(){
    // declare variables
    int intX = 0;
    int intY = 0;

    // calculate coordinates
    for(int intRow = 290; intRow >= 0; intRow -= 10){
      for(int intColumn = 290; intColumn >= intRow; intColumn -= 10){
        intX = 300 + 3 + intRow;
        intY = 3 + intColumn;

        // draw squares
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section7(){
    // declare variables
    int intX = 0;
    int intY = 0;

    // calculate coordinates
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 290 - intColumn; intRow >= 0; intRow -= 10){
        intX = 600 + 3 + intRow;
        intY = 3 + intColumn;

        // draw squares
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);

      }
    }
  }

  
  public void draw_section8(){
    // declare variables
    int intX = 0;
    int intY = 0;

    // calculate coordinates
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn <= intRow; intColumn += 10){
        intX = 900 + 3 + intRow;
        intY = 3 + intColumn;

        // draw squares
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);

      }
    }
  }
}