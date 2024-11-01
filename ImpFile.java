public class ImpFile<E> implements File<E>
{

	public Maillon<E> tete, queue;
	
	public ImpFile(Maillon<E> t, Maillon<E> q)
	{
		this.tete = t;
		this.queue = q;
	}
	
	public boolean estVide()
	{
		return this.tete == null;
	}

	public E premier() throws ExceptionFileVide
	{
		if(this.tete == null)
		{
			throw new ExceptionFileVide();
		}
		else
		{
			return this.tete.valeur;
		}
	}

	public void enfiler(E e)
	{
		Maillon<E> nouveau = new Maillon<>(e, null);
		nouveau.valeur = e;
		nouveau.successeur = null;
		
		if(this.tete == null)
		{
			this.tete = nouveau;
		}
		else
		{
			this.queue.successeur = nouveau;
		}
		
		this.queue = nouveau;
	}

	public void défiler() throws ExceptionFileVide
	{
		if(this.tete == null)
		{
			throw new ExceptionFileVide();
		}
		else
		{
			this.tete = this.tete.successeur;
		}
	}

}
