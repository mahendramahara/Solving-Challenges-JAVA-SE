// Garbage Collection Demonstration

public class GarbageCollection{
    public static void main(String[] args) {
        GarbageCollectedObject obj1 = new GarbageCollectedObject();
        GarbageCollectedObject obj2 = new GarbageCollectedObject();
        
        obj1 = null;
        
        System.gc();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class GarbageCollectedObject {
    public GarbageCollectedObject() {
        System.out.println("Object created: " + this);
    }
    
    protected void finalize() {
        System.out.println("Object destroyed: " + this);
    }
}

// Copyright © Mahendra Mahara 2023
