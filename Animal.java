public abstract class Animal {
    abstract class Animal {
        protected int legs;
    
        protected Animal(int legs) {
            this.legs = legs;
        }
    
        abstract void eat();
    
        void walk() {
            System.out.println(" he walks in " + legs + " legs.");
        }
    }
 } 
