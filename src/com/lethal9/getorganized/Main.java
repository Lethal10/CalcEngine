package com.lethal9.getorganized;

public class Main {

    public static void main(String[] args) {
        /*double[] leftVals = {100.0d , 25.0d , 225.0d , 11.0d};
        double[] rightVals = {50.0d , 92.0d , 17.0d , 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

         */
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d,50.0d,'d');
        equations[1] = create(25.0d,92.0d,'a');
        equations[2] = create(225.0d,17.0d,'s');
        equations[3] = create(11.0d,3.0d,'m');


            for (MathEquation equation : equations) {
                equation.execute();
                System.out.println("result = ");
                System.out.println(equation.results);


            }
        }

        public static MathEquation create (double leftVals , double rightvals, char opCode) {
        MathEquation equation = new MathEquation();
        equation.leftVals = leftVals;
        equation.rightVals = rightvals;
        equation.opCode = opCode;

        return equation;
        }
    }
