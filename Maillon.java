public class Maillon<E>
{
	
	public E valeur;
	public Maillon<E> successeur;
	
	public Maillon(E v, Maillon<E> s)
	{
		this.valeur = v;
		this.successeur = s;
	}
	
}
