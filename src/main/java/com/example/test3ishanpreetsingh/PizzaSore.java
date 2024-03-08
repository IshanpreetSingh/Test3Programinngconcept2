package com.example.test3ishanpreetsingh;

public class PizzaSore {

    private int id;
    private int Mobilenumber;

        private String Name ;
        private String Pizzasize;
        private String Numberoftopings ;

        private Integer Totalbill;

        public PizzaSore(int id, int Mobilenumber, String Name, String Pizzasize, String Numberoftopings,int Totalbill ) {
            this.id = id;
            this.Mobilenumber = Mobilenumber;
            this.Name = Name;
            this.Pizzasize = Pizzasize;
            this.Numberoftopings = Numberoftopings;
            this.Totalbill = Totalbill;

        }

        public int getid() {
            return this.id;
        }

        public void setid(int id) {
            this.id = id;
        }
    public int getMobilenumber() {
        return this.Mobilenumber;
    }

    public void setMobilenumber(int Mobilenumber) {
        this.Mobilenumber = Mobilenumber;
    }

        public String getName() {
            return this.Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getPizzasize() {
            return this.Pizzasize;
        }

        public void setPizzasize(String Pizzasize) {
            this.Pizzasize = Pizzasize;
        }

        public String getNumberoftopings() {
            return this.Numberoftopings;
        }

        public void setTotalbill() {
            this.Totalbill = Totalbill;

            public void setTotalbll(int Totlalbill) {
                this.id = Totlalbill;
        }
    }
}
