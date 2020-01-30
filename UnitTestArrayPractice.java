import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/**
 * This class is used to perform a unit test on the
 * ArrayPractice class.  
 * 
 * DO NOT ALTER THIS CLASS UNTIL INSTRUCTED TO DO SO.  
 *
 * @author Prof. White, modified by (Nathan Poirier)
 * @version Fall 2019
 */
public class UnitTestArrayPractice
{
    public static void main(String args[])
    {
        Double dArr[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer iArr[] = {1, 5, 4, 2, 3};
        Boolean bArr[] = {true, false, false, true, true, true};
        String sArr[] = {"Hello", "World!"};
        Double d2Arr[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer i2Arr[] = {1, 5, 4, 2, 3}; 
        

        //Test 0
        System.out.println("***Testing ArrayPractice.sum(Double[])***\n");
        printArray(dArr);
        System.out.println("Actual:    Sum of elements:  " + ArrayPractice.sum(dArr));
        System.out.println("\n***End test ArrayPractice.sum(Double[])***\n");

        //Test 1
        System.out.println("***Testing ArrayPractice.sum(Integer[])***\n");
        printArray(iArr);
        System.out.println("Actual:    Sum of elements:  " + ArrayPractice.sum(iArr));
        System.out.println("\n***End test ArrayPractice.sum(Integer[])***\n");

        //Test 2
        System.out.println("***Testing ArrayPractice.largest(Integer[])***\n");
        printArray(iArr);
        System.out.println("Actual:    Largest:  " + ArrayPractice.largest(iArr));
        System.out.println("\n***End test ArrayPractice.largest(Integer[])***\n");

        //Test 3
        System.out.println("***Testing ArrayPractice.countLarger(Integer[], int)***\n");
        System.out.print("values larger than 3 in ");
        printArray(iArr);
        System.out.println("Actual:    Larger:  " + ArrayPractice.countLarger(iArr, 3));
        System.out.println("\n***End test ArrayPractice.countLarger(Integer[], int)***\n");

        //Test 4
        System.out.println("***Testing ArrayPractice.countTrue(Boolean[])***\n");
        printArray(bArr);
        System.out.println("Actual:    Count:  " + ArrayPractice.countTrue(bArr));
        System.out.println("\n***End test ArrayPractice.countTrue(Boolean[])***\n");

        //Test 5
        System.out.println("***Testing ArrayPractice.stringLengths(String[])***\n");
        printArray(sArr);
        System.out.print("Actual:    Lengths:  ");
        printArray(ArrayPractice.stringLengths(sArr));
        System.out.println("\n***End test ArrayPractice.stringLengths(String[])***\n");
        
        
        Random gen = new Random();
        Double[] dubArray = new Double[gen.nextInt(5) + 6];
        Integer[] intArray = new Integer[gen.nextInt(5) + 6];
        for(int n = 0; n < dubArray.length; n++)
        {
            Double randomNum = ThreadLocalRandom.current().nextDouble(-2.0, 2.0 + 1);
            dubArray[n] = randomNum;
        }
        for(int n = 0; n < intArray.length; n++)
        {
            int randomNum = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
            intArray[n] = randomNum;
        }
        printArray(dubArray);
        System.out.println("Sum: " + ArrayPractice.sum(dubArray));
        printArray(intArray);
        System.out.println("Sum: " + ArrayPractice.sum(intArray));
        System.out.println("Larger: " + ArrayPractice.countLarger(intArray,intArray[0]));
        System.out.println("Largest int: " + ArrayPractice.largest(intArray));
        
    }

    /**
     * This method will print the values of the input array, 
     * each on the same line, separated by spaces.
     * 
     * @param obj[] The input array.
     */
    private static void printArray(Object objArr[])
    {
        if (objArr != null)
        {
            for(Object obj : objArr)
            {
                System.out.print(obj + " ");
            }
            System.out.println();
        }
    }
}