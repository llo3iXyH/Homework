package Part5;

public class Reader {
    private String fullName;            //ФІО
    private int number;                 //номер квитка
    private int phone;                  //номер телефону
    private int book;                   //Загальна Кількість книжок для першої частини задачі
    private int book1;                  //Скільки бере
/*    private int book2;*/                  //Загальна Кількість книжок для другої частини задачі
    private int rbook;                  //Скільки повертає

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public int getBook1() {
        return book1;
    }

    public void setBook1(int book1) {
        this.book1 = book1;
    }

    public int getRbook() {
        return rbook;
    }

    public void setRbook(int rbook) {
        this.rbook = rbook;
    }

    /*public int getBook2() {
        return book2;
    }

    public void setBook2(int book2) {
        this.book2 = book2;*/


    public void takeBooks(){
        int allbook = getBook()+getBook1();
        if (getBook() + getBook1() <= 5){
            System.out.println("Читач " + getFullName() + " взяв " + getBook1()+ " книги, наразі він має "+ allbook + " книг");
        }else if (getBook() + getBook1() >= 5){
            System.out.println("Ліміт книг перевищенно "+ allbook +", штраф " + (allbook-5)*50 + " вам буде нагадано за номерм мобільного"+getPhone());
        }else {
            System.out.println("Невірно вказані значення");
        }
    }


    public void returnBooks(){
        int allbook = getBook() - getRbook();
        if (getBook() - getRbook() == 0){
            System.out.println(getFullName() + " Повернув всі книги, номер його читацького квитка - " + getNumber());
        }else if (getBook() - getRbook() > 5){
            System.out.println(getFullName() +" На разі " + getFullName() + " має заборгованість, його штраф буде дорівнювати"+ (getBook()-5)*50 + "гривень \n В випадку якщо ви повернете" +
                    "недостатню кількіть книг, ваш штраф буде рівний"+(allbook-5)*50+ "по номеру читацького квитка"+getNumber() + "та виклик з мобільного телефону"+ getPhone());
        }else if(getBook() > 5){
            System.out.println(getFullName()+ " у Вас наразі заборгованості немає" + getRbook() + " книги. Але нараховано штраф за минулий місяць"+ (getBook()-5)*50);
        } else {
            System.out.println("Помилка, "+ getFullName()+" намагається повернути зайві книги, перевірте інформацію по номеру читацького квитка"+ getNumber());
        }
    }







    public static void main(String[] args) {
        Reader kot = new Reader();
        kot.setFullName("Kotov D.A.");
        kot.setBook(1);
        kot.setBook1(3);
        kot.setRbook(5);
        kot.takeBooks();
        kot.returnBooks();
        kot.setNumber(12);
        kot.setPhone(508087937);

        Reader igor = new Reader();
        igor.setFullName("Petrenko I.I.");
        igor.setBook(2);
        igor.setBook1(3);
        igor.setRbook(4);
        igor.takeBooks();
        igor.returnBooks();
        igor.setNumber(11);
        igor.setPhone(933911689);

        }

}
