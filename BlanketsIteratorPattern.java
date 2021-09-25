public class BlanketsIteratorPattern {
 
    public static void main(String[] args) {
    	BlanketTypesInterface types = new BlanketTypes();
    	types.addBlanket("Cotton",1200);
    	types.addBlanket("Polyester",1000);
         
    	BlanketsIterator iterator = new BlanketsIterator(types.getBlankets());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Removing last iterated type..");
        iterator = new BlanketsIterator(types.getBlankets());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
 
}