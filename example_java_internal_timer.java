long start = System.currentTimeMillis();
    
for (int i = 0; i < MaxSize; i++){
    ...
}

long end = System.currentTimeMillis();

System.out.println("Program use : " + (end - start) + " milliseconds");
