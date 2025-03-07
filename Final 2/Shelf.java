import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;



public class Shelf extends Application {
  private String[] Books = {"Dairy of a Wimpy kid", "Minecraft: The Lost Journals", "America Falls", "Neighborhood Watch", "FlashPoint",
"Minecraft: The Crash", "Minecraft: The End", "Minecraft: Mob Squad", "World War Z", "48 Hours", "Families First", 
"Heartstopper", "Minecraft: Castle Redstone", "Minecraft Legends: Return of the Piglins", "Minecraft: The Dragon" , "Minecraft Dungeons: Rise of the Arch-Illager",
"Minecraft: Mobestiary", "The Long Dark", "Darkness Falls"};

Books Book1 = new Books("https://m.media-amazon.com/images/I/71OHDzwWmjL._AC_UF1000,1000_QL80_.jpg","Being a kid can really stink. And no one knows this better than Greg. He finds himself thrust into middle school, where undersized weaklings share the hallways with kids who are taller, meaner, and already shaving.\n\nGreg is happy to have Rowley Jefferson, his sidekick, along for the ride. But when Rowley's star starts to rise, Greg tries to use his best friend's newfound popularity to his own advantage, kicking off a chain of events that will test their friendship in hilarious fashion.\n\nThe hazards of growing up before you're ready are uniquely revealed through words and drawings as Greg records them in his diary. But as Greg says: “Just don’t expect me to be all 'Dear Diary' this and 'Dear Diary' that.\n\nLuckily for us, what Greg Heffley says he won’t do and what he actually does are two very different things.");
Books Book2 = new Books("https://images2.penguinrandomhouse.com/cover/9780399180705", "Max and Alison are proof that differences don’t stand in the way of friendship. Max is always on the lookout for a new adventure—even if it means getting into trouble—while Alison prefers to follow the rules. But both of them are fascinated by the beat-up old journal Max finds and the strange gate its secretive author, the Enchanter, describes: a portal to an otherworldly realm of danger called the Nether.\n\nAfter they use the journal’s instructions to craft the portal, Max and Alison squabble over whether to remain safe in the Overworld or to journey into the Nether to find the Enchanter . . . until a fateful accident makes the decision for them.\n\nTrapped in a scary new world, Max and Alison find an ally in Freya, a fierce warrior who has been living in the Nether with her beloved wolf, Bunny Biter. With Freya’s help, and with the clues that lie in the pages of the mysterious journal, Max and Alison embark on a quest to find the Enchanter, even as the Nether pushes their skills—and their friendship—to the limit.\n");
Books Book3 = new Books("https://m.media-amazon.com/images/I/71WFP8dZusL._AC_UF1000,1000_QL80_.jpg", "In the middle of the holidays, a biological attack wreaks havoc on the U.S.\nThe virus is quick. Deadly. Unstoppable. The country is left in tatters.For Isaac Race, it’s especially bitter. After the death of his parents and sister, he was just getting his life back on track - the weaponized virus changes all that. Battered by the fresh deaths of his foster parents, but hardened by the year he’s endured, he emerges from the temporary safety of his home to seek out other survivors during the most vicious winter on record. With the help of his friend Luke, he soon discovers that 250 perilous miles stand between them and the only possible haven, three states away, in the White Mountains of New Hampshire. It won’t be easy. The invaders and the freezing temperatures aren’t the only dangers facing them at the end of the world. To survive, they’ll have to risk everything and do anything to protect themselves in a world where trust and safety have been shattered.");
Books Book4 = new Books("https://m.media-amazon.com/images/I/91U8DP6pcAL._UF894,1000_QL80_.jpg", "One second was all it took to erase Frank’s dreams. New home. New car. New retirement. Stolen by the EMP. It gets worse. Frank’s neighbors failed to prepare at all, so it falls on him to keep them alive. He starts easy: stockpile food, water, and guns. Disaster lessons he'd picked up reading books about the end of the world. But after the EMP, keeping people safe gets complicated. He has to rally the neighborhood before the streets turn to chaos. And they will. He’s read enough to know the power might come on tomorrow……or never.");
Books Book5 = new Books("https://m.media-amazon.com/images/I/71nX5n4EWIL._SL1500_.jpg", "Half of the earth's population has been wiped out. Impossible to predict or stop, the Gamma Ray Burst tore through the Earth like a bullet, its radiation wave killing hundreds of millions and the aftereffects ensuring the deaths of billions more.\n\nNow, as the world crumbles around them, a ragtag group of survivors make for the only home they know - the small town of Mercy. Spared the worst of the GRB's effects, the town is isolated, safe and self-sufficient - for now.\n\nThe flash hasn't just decimated the Earth's population, though. It's brought out the worst in many of those who are still alive. Survival in this new world doesn't just depend on preparedness - it depends on strength.\n\n*****\n\n It's the one disaster no one can plan for. A rogue cosmic event called a Gamma Ray Burst, sending a spike of radiation through the earth like a .50 caliber bullet through a ripe watermelon. It's speculated that such an event hit the Earth at some point in the past, causing a mass extinction event. With two potential sources for a GRB pointed directly at our heads, the chances of another one happening in our lifetime is remote... but still possible.\n\n In Flashpoint, we explore such an event and the havoc it would wreak across the entire planet. From destroying our atmosphere to millions dying from incredibly painful radiation exposure, a GRB would be unpredictable and unavoidable for everyone, rich and poor, prepared and unprepared alike.");
Books Book6 = new Books("https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1521279580i/39303946.jpg", "Bestselling author and native Israeli Amir Tsarfati’s mission is to help people around the world live with clarity and confidence in light of Christ’s soon return. With Any Day Now, he provides a succint alert that earth’s final days are drawing near. As you read, you will…\n explore the clues that suggest Christ's second coming could occur at any moment\n examine Bible prophecy through the perspective of an Israeli, allowing you to better grasp the significance of what’s happening in the Middle East today\nembrace a spirit of expectancy, always ready for the Lord's return​\n In today’s darkened world, only Christ can give us true hope. Any Day Now will help you to understand what is next in God’s prophetic plan—and encourage you with the promise that Jesus’s return and the restoration of His people are just around the corner.");
Books Book7 = new Books("https://images.penguinrandomhouse.com/cover/9780593972854", "Bianca has never been good at following the plan. She’s more of an act-now, deal-with-the-consequences-later kind of person. But consequences can’t be put off forever, as Bianca learns when she and her best friend, Lonnie, are in a terrible car crash.\n\nWaking up in the hospital, almost paralyzed by her injuries, Bianca is faced with questions she’s not equipped to answer. She chooses instead to try a new virtual-reality version of Minecraft that responds to her every wish, giving her control over a world at the very moment she thought she’d lost it. As she explores this new realm, she encounters a mute, glitching avatar she believes to be Lonnie. Bianca teams up with Esme and Anton, two kids who are also playing on the hospital server, to save her friend.\n\nBut the road to recovery isn’t without its own dangers. The kids are swarmed by mobs seemingly generated by their fears and insecurities, and now Bianca must deal with the uncertainties that have been plaguing her: Is Lonnie really in the game? And can Bianca help him return to reality?");
Books Book8 = new Books("https://images.penguinrandomhouse.com/cover/9780593599747", "For as long as they can remember, the twin endermen Fin and Mo have lived in the mysterious land of the End. On the outskirts of the great enderman city of Telos, they explore ancient ruins under the watchful gaze of the mighty ender dragon. They have everything they need in the end ship they call home, and know everything there is to know about their world—or so they think until the strangers from another dimension arrive.\n\nThe invaders are called humans, and they’ve come to steal artifacts and slay the ender dragon. Fin and Mo are ready to protect their home from the trespassers, but when they come face-to-face with the humans, they discover that they aren’t as prepared for battle as they’d thought. Caught off guard, the twins are trapped in the middle of a war between the endermen and the humans, with the future of their home at stake.");
Books Book9 = new Books("https://target.scene7.com/is/image/Target/GUEST_01148569-49b0-4443-ba8e-2e9347b57d03", "It's been hailed as a groundbreaking new pesticide - a true revolution for farming and invasive plant control techniques. When strange deaths start spreading around the country like wildfire, it becomes apparent that this miracle chemical is actually a nightmare that threatens the lives of every single person on the planet.\n\n On a small farm in rural Virginia, a string of animal deaths leads to the discovery of a horror beyond imagining. It is inescapable, unavoidable and impossible to combat, and everyone who comes close to it risks certain death. Worst of all - it's spreading.\n\n In the Amazon rain forest, secret testing by the chemical's creator reveals its true effects, both on plant and animal life. Horrified by what he's created, he faces an uphill battle to reveal the truth as the world begins to crumble around him.\n\n A mother - separated from her husband and child and trapped in the bottom of a bottle - chooses to fight the encroaching shadows, and in doing so brings light to the darkness. Her decisions, and those of other survivors of this horrific event, will be the only thing that stands between humanity and total annihilation.");
Books Book10 = new Books("https://m.media-amazon.com/images/I/815cfzjmSnL._AC_UF1000,1000_QL80_.jpg", "The village of Cornucopia is practically perfect in every way. Plenty of food, cozy homes, and a huge wall to keep everyone safe from the scary world outside. What more could a kid possibly need?\n\n Well, a lot, actually.\n\n Mal, a fearless girl, needs adventure, and her friends are right there with her: Lenna, a dreamer whose family underestimates her every day. Tok and Chug, brothers who love to build stuff (Tok) and smash stuff (Chug). They’re best friends, and in a town whose grown-ups value safety over bravery and fitting in over standing out, they’re the bad apples.\n\n But when a mysterious mob sneaks past Cornucopia’s defenses, the village is in huge trouble. And nobody knows what to do. Finally faced with the adventure she’s always wanted, Mal and her friends defy the rules their elders have always followed and set out beyond the wall for the first time.\n\n On their journey across the Overworld, they discover wonders they’ve never dreamed of and dangers they’ve never imagined. To save the day, they’ll have to prove they’re more than bad apples. They’re the Mob Squad!");
Books Book11 = new Books("https://m.media-amazon.com/images/I/71sZ-sryepL._AC_UF1000,1000_QL80_.jpg", "We survived the zombie apocalypse, but how many of us are still haunted by that terrible time? We have (temporarily?) defeated the living dead, but at what cost? Told in the haunting and riveting voices of the men and women who witnessed the horror firsthand, World War Z is the only record of the pandemic.\n\nThe Zombie War came unthinkably close to eradicating humanity. Max Brooks, driven by the urgency of preserving the acid-etched first-hand experiences of the survivors, traveled across the United States of America and throughout the world, from decimated cities that once teemed with upwards of thirty million souls to the most remote and inhospitable areas of the planet. He recorded the testimony of men, women, and sometimes children who came face-to-face with the living, or at least the undead, hell of that dreadful time. World War Z is the result. Never before have we had access to a document that so powerfully conveys the depth of fear and horror, and also the ineradicable spirit of resistance, that gripped human society through the plague years." );
Books Book12 = new Books("https://cdn.waterstones.com/bookjackets/large/9781/4449/9781444951387.jpg",  "In 48 hours, the Earth will be hit by a Coronal Mass Ejection (CME) from the Sun, a \"Carrington Event\" that has the power to shut down and possibly destroy the world's electrical infrastructure. To try and prevent permanent damage, everything goes dark prior to the hit: global communications are shut down; hospital emergency generators are disconnected; the entire internet, media broadcasting, and cell phone systems are turned off.\n\n Will the world's population successfully defend itself in the wake of the CME, or will mass panic lead to the breakdown of society as we know it?\n\n William R. Forstchen is at his best in 48 Hours, a tale of the resilience of American citizens when faced with a crisis. ");
Books Book13 = new Books("https://images.penguinrandomhouse.com/cover/9780593498538", "Families First is a powerful story of one ordinary family thrown into darkness when an EMP shuts off the power to the entire US mainland and throws the country back into the 1800s in seconds. This family must quickly amass a group of friends and neighbors for an 800-mile trek from north Texas to the Rocky Mountains of Colorado. Character-driven, the story twists and turns and doesn’t let up until the end. PG-13 The Stand meets The Road...\n\n Step into a world where survival is the only option and familial bonds are everything. Families First is a riveting and dynamic Post-Apocalyptic Next-World series that immerses you in the lives of relatable and imperfect characters as they navigate an uncertain future. With every turn of the page, you'll be on the edge of your seat, wondering what obstacles the characters will face next. If you enjoy stories about the strength of humanity in the face of adversity, Families First is the series for you.");
Books Book14 = new Books("https://images.penguinrandomhouse.com/cover/9780593355718", "Shy and softhearted Charlie Spring sits next to rugby player Nick Nelson in class one morning. A warm and intimate friendship follows, and that soon develops into something more for Charlie, who doesn't think he has a chance.\n\n But Nick is struggling with feelings of his own, and as the two grow closer and take on the ups and downs of high school, they come to understand the surprising and delightful ways in which love works.");
Books Book15 = new Books("https://images2.penguinrandomhouse.com/cover/9780593355732", "Rajah would do anything to be a great adventurer. But how can he, when his father’s already triumphed over every adventure he can think of? Lord Maharajah fought the Ender Dragon, charted the Overworld, and built a grand manor house. Rajah is surrounded by hand-me-downs, from his father’s fancy old name to his fancy old sword.\n\n His servant, Pal, and his squire, Faith, do what they can to help. But Pal is too gentle to be any good in a fight, and Faith’s faith is being tested by the knight she thought was a hero. Try as he might, Rajah isn’t anyone’s hero—he’s everyone’s punchline.\n\n Everything changes, though, when, at the end of another day’s failure, Rajah, Pal, and Faith find something: a map that leads to the one place Lord Maharajah never conquered—a legendary castle rumored to hide a mysterious lost civilization’s wondrous inventions.\n\n At last, the greatest adventure of their lives has begun. The three must trek through perilous swamps, climb high mountains, and discover their true worth. It’s the only way to reach their distant destination: Castle Redstone!");
Books Book16 = new Books("https://images.penguinrandomhouse.com/cover/9780399180835", "Farnum dreams of running a famous zoo. But though the mobs he keeps are adorable, none of them draws anything close to a crowd. Farnum needs something strange and new—but he’s the furthest thing from an adventurer. It takes a lot of convincing from his friends, but Farnum finally takes a chance and goes with them to explore a lush new biome . . . which is how he ends up falling down a waterfall and washing up in front of a mysterious purple portal.\n\n Kritten has advised many powerful piglins. Few have been as fearsome or demanding as the Great Bungus. If Kritten wants their head to stay on their shoulders, the pint-sized piglin advisor is going to need to find their clan more land. And fast. At their most desperate point, they discover a cavern filled with ancient piglin carvings, depicting a legend that may have all the answers they’re looking for. Once upon a time, three fabled piglin hordes left the Nether behind and made war on the Overworld. And Kritten thinks they might just have a way to do the same now. All they need is the help of someone in the Overworld foolish enough to trust them . . . someone like Farnum.\n\n Together, zookeeper and piglin are about to carve out a legend of their own. And the Overworld may never be the same!");
Books Book17 = new Books("https://images-na.ssl-images-amazon.com/images/I/61ASXwziOKL.jpg", "Zetta is the best potion-maker in the village of Sienna Dunes. Okay, maybe she’s the only potion-maker in the village of Sienna Dunes. And maybe her potions don’t exactly work like they’re supposed to all the time. But when her village is menaced by a pack of illagers, only Zetta can see that the traditional ways won’t keep Sienna Dunes safe anymore. \n\n Zetta journeys to her eccentric aunt’s workshop outside town to search for an answer and finds a lot more than she bargained for. A mysterious egg hatches into a scaly creature with purple eyes, black wings, and poisonous breath. It can’t possibly be the mythical ender dragon . . . can it? And if it is, can Zetta raise it to be the savior her village needs?\n\n The threat of the illagers is growing fast, and Zetta’s accidental dragon is growing even faster. With the help of her two best friends and her daydreaming little cousin, Zetta must train the scariest (and scaliest) baby in the Overworld. But when the dragon is fully grown, will it save Sienna Dunes? Or will it spell the village’s end?");
Books Book18 = new Books("https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1715348303i/213161205.jpg", "Brave heroes have banded together to take a perilous journey through the war-torn Overworld to defeat the Arch-Illager and his formidable army. But how did that army come to be? And just where did the Arch-Illager come from?\n\nThe terrible truth behind the Arch-Illager is that he never asked for ultimate power. Known as Archie, this little Illager is bullied by his fellow Illagers and mistrusted by fearful Villagers. Archie only ever wanted a place to call home, but he finds himself shunned by all. As he wanders through deep forests and up craggy mountains, he stumbles upon a dark cavern—with a sinister secret waiting inside.\n\nArchie discovers an object that whispers to him promises of power: the Orb of Dominance. With it, Archie realizes he can wield incredible magic and reshape a world that turned its back on him. All he needs to do is exactly what it tells him . . .\n\nAfter all, it’s called the Orb of Dominance for a reason, right? But is it named for the way Archie uses it—or is it using him?");
Books Book19 = new Books("https://media.takealot.com/covers_images/b13ed07c801a4b6db764b735aface677/s-pdpxl.file", "With insider gaming info and tips, this is the official, definitive, fully illustrated guide to mobs—and how to outsmart them—in Minecraft.\n\n Minecraft: Mobestiary reveals the secrets of every mob in the game. You’ll find little-known facts about passive, neutral, hostile, utility, and boss mobs, as well as more general information about their locations, behaviors, threat levels, and drops.\n\n Written by Alex Wiltshire, author of Minecraft: Blockopedia and former editor at Edge magazine, who has made it his life’s work to study Minecraft’s mobs. Illustrated with field sketches throughout by Anton Stenvall.");
Books Book20 = new Books("https://g.christianbook.com/dg/slideshow/f400/986700_1_ftc.jpg", "On a fateful night, a devastating force sweeps across America, killing millions without warning or explanation.\n\n Solly Masters finds himself trapped in the deadly chaos of Manhattan, his ex-wife Bella and their children over a thousand miles away in Texas. With the country's infrastructure in ruins and no government authority to be seen, Solly is forced to navigate the now-lawless landscape in a desperate journey to reach his family.\n\n But New York is just the beginning. From violence-plagued cities to cult-controlled communes, staying alive will mean making harrowing choices at every turn. As supplies dwindle and hope fades, Solly and a small band of survivors must forge his own path through the ruins of civilization to be reunited with his family. Allegiances will be forged and broken, innocence lost, and no one can be trusted in the face of outlaws and fanatics competing for scarce resources.\n\n From a master of post apocalyptic science fiction, comes a white-knuckled tale of survival in the ruins of civilization where the bonds of family and friendship are the only line of defense against unspeakable evil.\n\n The Long Fall is an electrifying thriller that will leave you questioning whether our reliance on technology may turn out to be our fatal flaw.");


  
            private ImageView[] BookCover = {new ImageView(Book1.getImage()),
(new ImageView(Book2.getImage())), 
(new ImageView(Book3.getImage())), 
(new ImageView(Book4.getImage())),
(new ImageView(Book5.getImage())),
(new ImageView(Book6.getImage())),
(new ImageView(Book7.getImage())),
(new ImageView(Book8.getImage())),
(new ImageView(Book9.getImage())),
(new ImageView(Book10.getImage())),
(new ImageView(Book11.getImage())),
(new ImageView(Book12.getImage())),
(new ImageView(Book13.getImage())),
(new ImageView(Book14.getImage())),
(new ImageView(Book15.getImage())),
(new ImageView(Book16.getImage())),
(new ImageView(Book17.getImage())),
(new ImageView(Book18.getImage())),
(new ImageView(Book19.getImage())),
(new ImageView(Book20.getImage()))};


  private String[] bookDescription = new String[50];

  private DescriptionPane descriptionPane = new DescriptionPane();

  private ComboBox<String> cbo = new ComboBox<>();

  @Override
  public void start(Stage primaryStage){
    bookDescription[0] = Book1.getDescription();
    bookDescription[1] = Book2.getDescription();
    bookDescription[2] = Book3.getDescription();
    bookDescription [3] = Book4.getDescription();
    bookDescription[4] = Book5.getDescription();
    bookDescription[5] = Book6.getDescription();
    bookDescription[6] = Book7.getDescription();
    bookDescription[7] = Book8.getDescription();
    bookDescription[8] = Book9.getDescription();
    bookDescription[9] = Book10.getDescription();
    bookDescription[10] = Book11.getDescription();
    bookDescription[11] = Book12.getDescription();
    bookDescription[12] = Book13.getDescription();
    bookDescription[13] = Book14.getDescription();
    bookDescription[14] = Book15.getDescription();
    bookDescription[15] = Book16.getDescription();
    bookDescription[16] = Book17.getDescription();
    bookDescription[17] = Book18.getDescription();
    bookDescription[18] = Book19.getDescription();
    bookDescription[19] = Book20.getDescription();

           setDisplay(0);
           
          BorderPane pane = new BorderPane();

          BorderPane paneForComboBox = new BorderPane();
          paneForComboBox.setLeft(new Label("Select a Book: "));
          paneForComboBox.setCenter(cbo);
          pane.setTop(paneForComboBox);
          cbo.setPrefWidth(200);
          cbo.setValue("Dairy of a wimpy kid");

          ObservableList<String> items = FXCollections.observableArrayList(Books);
          cbo.getItems().addAll(items);
          pane.setCenter(descriptionPane);

          cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));

          Scene scene = new Scene(pane, 900, 900);
          primaryStage.setTitle("Digital Shelf 1");
          primaryStage.setScene(scene);
          primaryStage.show();
             }
           

   public void setDisplay(int index){
    descriptionPane.setTitle(Books[index]);
    descriptionPane.setImageView(BookCover[index]);
    descriptionPane.setDescription(bookDescription[index]);
    
   }

   public static void main(String[] args) {
    launch(args);
   }




}
class Books {
 String Image;
String Description;

Books(){     
}

Books(String newImage, String newDescription){
        Image = newImage;
        Description = newDescription;
}

String getImage(){
        return Image;
}
String getDescription(){
        return Description;
}

        
}


class DescriptionPane extends BorderPane {
    
private Label lblImageTitle = new Label();
 
   
private TextArea taDescription = new TextArea(); 
 
     public DescriptionPane() { 
       lblImageTitle.setContentDisplay(ContentDisplay.TOP);
       lblImageTitle.setPrefSize(50, 50);
 
      // Set the font in the label and the text field 
       lblImageTitle.setFont(new Font("SansSerif", 16));
       taDescription.setFont(new Font("Serif", 14));
 
       taDescription.setWrapText(true);    
       taDescription.setEditable(false);
 
       // Create a scroll pane to hold the text area 
        ScrollPane scrollPane = new ScrollPane(taDescription); 
 
      // Place label and scroll pane in the border pane 
       setLeft(lblImageTitle);
       setCenter(scrollPane); 
       setPadding(new Insets(5, 5, 5, 5));
     }
 
     /** Set the title */ 
     public void setTitle(String title) {
       lblImageTitle.setText(title);
     }
 
     /** Set the image view */ 
    public void setImageView(ImageView icon) {
      lblImageTitle.setGraphic(icon);
    }
 
    /** Set the text description */ 
     public void setDescription(String text) {
       taDescription.setText(text);
     }
   }

   
