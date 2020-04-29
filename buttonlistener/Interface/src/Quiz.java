
public class Quiz implements Measurable
	{
	   private String name;
	   private double score;

	   /**
	      Construct a country with name and area.
	      @param name student's name
	      @param score score of country
	   */
	   public Quiz(String name, double score)
	   {
	      this.name = name;
	      this.score = score;
	   }

	   /**
	      Measurable interface method to retrieve measure.
	      @return the measured area
	   */
	   public double getMeasure()
	   {
	      return score;
	   }
	}

