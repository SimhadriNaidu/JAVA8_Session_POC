package com.java8.optional;

import java.util.Optional;

public class OptionalIfvsIs {

	public static void main(String[] args) {
		
		Optional<String> GOT = Optional.of("Game of Thrones");   
		
        //Optional.empty() creates an empty Optional object        
        Optional<String> nothing = Optional.empty();
        
        /* isPresent() method: Checks whether the given Optional         
         * Object is empty or not.         
         */        
        if (GOT.isPresent()) {          
           System.out.println("Watching Game of Thrones");       
        } 
        else {            
           System.out.println("I am getting Bored");      
        }
        /* ifPresent() method: It executes only if the given Optional         
         * object is non-empty.         
         */        
        //This will print as the GOT is non-empty 
        
        GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));   
        
        //This will not print as the nothing is empty        
        nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
  
      //orElse() method
        System.out.println(GOT.orElse("Default Value")); 
        System.out.println(nothing.orElse("Default Value")); 

        //orElseGet() method
        System.out.println(GOT.orElseGet(() -> "Default Value")); 
        System.out.println(nothing.orElseGet(() -> "Default Value")); 

	}

}
