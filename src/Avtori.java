/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Avtori {

    private String Autor;// автор
    private String Book; // книги
    private int Year;// года

    public Avtori(String Autor, String Book, int Year) {
        this.Autor = Autor;
        this.Book = Book;
        this.Year = Year;

    }

    public String getAutor() {
        return Autor;
    }

    public String getBook() {
        return Book;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setBook(String Book) {
        this.Book = Book;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

}
