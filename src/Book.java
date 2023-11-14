class Book {
    private String author;
    private FirstPage firstPage;

    class FirstPage {
        private String poem;

        public FirstPage() {

            if ("Eminescu".equals(author)) {
                this.poem = "Un cer de stele dedesubt\n" +
                        "Deasupra-i cer de stele\n" +
                        "Parea un fulger ne'ntrerupt\n" +
                        "Ratacitor prin ele";
            } else if ("Alecsandri".equals(author)) {
                this.poem = "In paduri trasnesc stejarii! E un ger amar, cumplit!\n" +
                        "Stelele par inghetate, cerul pare otelit\n" +
                        "Iar zapada cristalina pe campii stralucitoare\n" +
                        "Pare-un lan de diamanturi ce scartaie sub picioare \n";
            } else if ("Cosbuc".equals(author)) {
                this.poem = "Sunt copii. Cu multe sanii\n" +
                        "De pe coasta vin tipand\n" +
                        "Si se-mping si sar razand\n" +
                        "Prin zapada fac matanii\n" +
                        "Vrand-nevrand \n";
            } else {
                this.poem = "Introdu alt autor valabil.";
            }
        }

        public String getPoem() {
            return poem;
        }


        public void setPoem(String poem) {
            this.poem = poem;
        }

        public int numberVowels() {
            int count = 0;
            String vowels = "aeiouAEIOU";

            for (char c : poem.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }

            return count;
        }
    }

    public Book(String author) {
        this.author = author;
        this.firstPage = new FirstPage();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: \n" +
                "autor: " + author + '\n' +
                "poem: \n" + firstPage.getPoem() + '\n' +
                "numar de vocale =" + firstPage.numberVowels()  +
                '\n';
    }

    public static void main(String[] args) {

        Book book1 = new Book("Eminescu");
        Book book2 = new Book("Alecsandri");
        Book book3 = new Book("Cosbuc");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }
}
