import java.util.Arrays;

public class AutoPrint {
        public void printDiamondAuto(int numLayers){
        if(numLayers % 2 == 0)throw new IllegalArgumentException("You must give an odd number otherwise diamond wont happen");

        for(int i = 0; i < numLayers;i++){
            //set up and calculate our initial points
            boolean evenRow = (i + 1) % 2 == 0;
            int midPoint = Math.floorDiv(numLayers,2);
            char[] rowString = new char[numLayers];
            Arrays.fill(rowString,' ');

            //calculate our character at the middle of the string
            char midChar = evenRow ? ' ' : '*';
            rowString[midPoint] = midChar;
            int distanceFromEnd = i > midPoint ? numLayers - i : i;

            //from the midpoint recursively transverse the array to the end in both directions
            changeString(midPoint + 1, midChar, rowString, true,distanceFromEnd);
            changeString(midPoint - 1, midChar, rowString, false,distanceFromEnd);

            //change char[] to string and print
            System.out.println(new String(rowString));
        }
    }

    private void changeString(int index,char prev,char[] charArray,boolean increasing,int distanceFromEnd){
        //ensure index not null
        if(index > charArray.length - 1 || index < 0)return;
        //limit number of stars to print depending on distance from tips
        if(distanceFromEnd == 0)return;

        //going up or down array
        int direction = increasing ? 1 : -1;
   
        if(prev == ' '){
            charArray[index] = '*';
        }else{
            charArray[index]= ' ';
        }

        //update our values for the next iteration and call recursively
        char newPrev = prev == ' ' ? '*' : ' ';
        int newIndex = index + direction;
        int newDistanceFromEnd = distanceFromEnd -1;

        changeString(newIndex,newPrev,charArray,increasing,newDistanceFromEnd);
    }
}
