package EX2;

public class enumclo {
    public enum Sizes {
        XXS(32){
            @Override
            public void getDescription(){
                System.out.print("Kid's size");
            }
        }, XS(34), S(36), M(38), L(40);

        private int size;
        Sizes (int size){
            this.size=size;
        }
        public void getDescription(){
            System.out.print("Adult's size");
        }

    }

}
