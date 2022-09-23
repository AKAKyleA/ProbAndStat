
public class ProbAndStat // Comment Added by Matthew Roesch to show repositiory change
{
    
    
    public static double mean(int[] values)
    {
        double count = 0;
        
        int size = values.length;
        
        for(int i = 0 ; i < size; i++)
        {
            count = count + values[i];
        }
         
        return count/size;
    }
    
    
    public static double median(int[] values)
    {
        int size = values.length;   //num of elements
        
        int lowestVal = 0;
        
        
        int temp = 0;
        
        double med = 0;
      
        for(int i = 0; i < size; i++)
        {
            
            
            
            for(int j = i; j < size; j++)
            {
                lowestVal = values[i];
                
                if(values[j] < lowestVal)
                {
                    
                    lowestVal = values[j];
                    
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                
                
                }

            }
            
        }
        
  
        if(size % 2 == 0) //even
        {
            
            med = (values[size/2 - 1] + values[size/2]) / 2.0;
            
            
        }
        else
        {
            
            med = values[(size-1)/2];
            
            
            
            
        }
        
        
        
        
        
        return med;
        
    }
    
    
    public static int mode(int[] values)
    {
        
        int size = values.length;   //num of elements
        
        
       
        int tempMode;   // array element being counted 
        int counter = 0;  // number of times element appears in array
        int highestMode = 0; //element most occuring in array 
        int highestModeCount = 0;//number of times element occurs 
        
        for(int i = 0; i < size; i++)  //loops array to test each elements 
        {
            tempMode = values[i];  
            
            for(int j = 0; j < size; j++)  //loops array to count how many times element appears
            {
                
                if(tempMode == values[j]) 
                {
                    counter = counter + 1;
                }
            }
            
            if(counter > highestModeCount) //if current element appears more times then 
            {                              //previous highest element, current replaces as new highest
                highestMode = tempMode;
                highestModeCount = counter;
            }
            
            counter = 0;  //reset counter
        }
        
        return highestMode;
    }
    
    
   
    
    
    
    public static void main(String[] args)
    {
        
        int[] values = {1,2,3,4,5,6,7,8,9,10};
        
        
        System.out.println(median(values));

    }
    
    
    
    
    
    
    
    
    
    
}
