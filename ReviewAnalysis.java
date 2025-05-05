public class ReviewAnalysis
{
    private Review[] allReviews; //creates array of Review objects
    
    public ReviewAnalysis(Review[]reviews)
    {
        allReviews=reviews
    }

    public double getAverageRating()
    {
        double sum=0;
        int count =allReviews.length;

        for (int i=0;i<allReviews.length;i++)
        {
            sum+=allReviews[i];
        }

        return (sum/count);
    }

    public ArrayList<String> collectComments()
    {
        
    }

}