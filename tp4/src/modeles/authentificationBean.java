package modeles;

public class authentificationBean {
private String nom;
private String prenom;

public authentificationBean(String nom, String prenom){
	this.nom=nom;
	this.prenom=prenom;

	
}
public authentificationBean(){
	setNom("");
	setPrenom("");
}
public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}
}