package com.lethal9.getorganized;

public class MathEquation {
    public double leftVals;
    public double rightVals;
    public char opCode;
    public double results;

    public void execute() {

            switch (opCode) {
                case 'a' :
                    results = leftVals + rightVals;
                    break;

                case 's':
                    results = leftVals - rightVals;
                    break;

                case 'd':
                    results= rightVals != 0.0d ? leftVals / rightVals : 0.0d;

      /*if (val2 != 0.0d)
          result = val1 / val2 ;
      else
          result = 0.0d;

       */

                    break;
                case 'm':
                    results = leftVals * rightVals;
                    break;


                default:
                    System.out.println("Error - invalid opCode");
                    results = 0.0d;
                    break;

            }
    }

}
