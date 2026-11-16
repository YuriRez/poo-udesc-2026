package exercicio5oo.classes;

 public class Livro {
     private static final String MENSAGEM_EMPRESTADO = "Livro emprestado\n";
     private static final String MENSAGEM_DEVOLVIDO = "Livro devolvido\n";


     private String titulo;
     private String autor;
     private String genero;
     private boolean emprestado;

     public String getAutor() {
         return autor;
     }

     public void setAutor(String autor) {
         this.autor = autor;
     }

     public String getGenero() {
         return genero;
     }

     public void setGenero(String genero) {
         this.genero = genero;
     }

     public boolean isEmprestado() {
         return emprestado;
     }

     public void setEmprestado(boolean emprestado) {
         this.emprestado = emprestado;
     }

     public String getTitulo() {
         return titulo;
     }

     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }

     public void emprestar() {
         emprestado = true;
         System.out.printf(MENSAGEM_EMPRESTADO);
     }

     public void devolver() {
         emprestado = false;
         System.out.printf(MENSAGEM_DEVOLVIDO);
     }

     public boolean estaDisponivel() {
         return !emprestado;
     }
 }
