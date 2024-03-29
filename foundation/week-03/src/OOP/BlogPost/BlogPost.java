package OOP.BlogPost;

public class BlogPost {
/*Create a OOP.BlogPost class that has
    -an authorName
    -a title
    -a text
    -a publicationDate

    Create a few blog post objects:
1
    "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
    Lorem ipsum dolor sit amet.
2
    "Wait but why" titled by Tim Urban posted at "2010.10.10."
    A popular long-form, stick-figure-illustrated blog about almost everything.
3
    "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
    Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
    When I asked to take his picture outside one of IBM’s New York City offices,
    he told me that he wasn’t really into the whole organizer profile thing.*/

  //fields
  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getTitle() {
    return title;
  }

  public String getText() {
    return text;
  }

  public String getPublicationDate() {
    return publicationDate;
  }
}
