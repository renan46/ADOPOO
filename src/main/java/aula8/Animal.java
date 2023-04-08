package aula8;

public class Animal {
private String especie;
private String nome;
private int idade;

public Animal(String especie, String nome, int idade) {
	this.especie = especie;
	this.nome = nome;
	this.idade = idade;
}

    Animal(String b, String c, String d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public String getEspecie() {
	return especie;
}
public void setEspecie(String especie) {
	this.especie = especie;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}

public void mostrarAnimal() {
	System.out.println(this.getEspecie());
	System.out.println(this.getNome());
	System.out.println(this.getIdade());
	System.out.println("----------");
}

}
