package com.lethal9.getorganized;

public class MathEquation {
    private double leftVals;
    private double rightVals;
    private char opCode;
    private double results;

    public  double getLeftVals() {return leftVals;}
    public void setLeftVals(double leftVals) {this.leftVals = leftVals;}
    public double getRightVals() {return rightVals;}
    public void setRightVals(double rightVals) {this.rightVals = rightVals;}
    public char getOpCode() {return  opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    public double getResults() {return results;}
    public MathEquation() { }

    public MathEquation (char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVals, double rightVals) {
        this(opCode);
        this.leftVals = leftVals;
        this.rightVals = rightVals;
    }


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
