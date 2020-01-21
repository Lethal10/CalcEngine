package com.lethal9.getorganized;

public class Main {

    public static void main(String[] args) {
        /*double[] leftVals = {100.0d , 25.0d , 225.0d , 11.0d};
        double[] rightVals = {50.0d , 92.0d , 17.0d , 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

         */
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',100.0d,50.0d);
        equations[1] = new MathEquation('a',25.0d,92.0d);
        equations[2] = new MathEquation('s',225.0d,17.0d);
        equations[3] = new MathEquation('m',11.0d,3.0d);


            for (MathEquation equation : equations) {
                equation.execute();
                System.out.println("result = ");
                System.out.println(equation.getResults());


            }
        }

        /*public static MathEquation create (double leftVals , double rightvals, char opCode) {
        MathEquation equation = new MathEquation();
        equation.setLeftVals(leftVals);
        equation.setRightVals(rightvals);
        equation.setOpCode(opCode);

        return equation;
        }

         */
    }
