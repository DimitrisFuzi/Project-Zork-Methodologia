package projectjava;
	
import java.util.HashMap;

public class HashMaping {
    HashMap <String,String> hashMap = new HashMap <String,String>();
    
        public void CreateHashMapping()
    {
        hashMap.put("go east", null);
         hashMap.put("go west", null);
          hashMap.put("go south", null);
           hashMap.put("go north", null);
            hashMap.put("open", null);
             hashMap.put("pick up", null);
              hashMap.put("exit", null);
    }

    
    public Boolean CheckingHashMapping(String text) 
    {
        boolean k;
             
                     k=hashMap.containsKey(text); /*  tsekarei an i entoli tou xristi einai
                                                    * stis entoles tou hashmap 
                                                    */
                 return k;  
    
    }   
}