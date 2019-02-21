package me.chrispeng.ibatisresolvetypealias.pojo.business;

public final class BookDO {
    private String title;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "BookDO{" +
            "title='" + title + '\'' +
            ", isbn='" + isbn + '\'' +
            '}';
    }
}
