package Trial;

import java.awt.Color;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class DiscordProjectType1 {
	public static void main (String [] args) throws IOException
	{
		DiscordWebhook webhook = new DiscordWebhook("https://discord.com/api/webhooks/900022843138519050/JQWf_qEKmLfb3AD-GE4nTSQNW05vsG6WqBL4lB9Z6WrMQ2fFDxZJxVENP4Z7jjeYHhR_");
	    webhook.setContent("Any message!");
	    webhook.setAvatarUrl("https://your.awesome/image.png");
	    webhook.setUsername("Custom Usernames!");
	    webhook.setTts(true);
	    webhook.addEmbed(new DiscordWebhook.EmbedObject()
	            .setTitle("Title")
	            .setDescription("This is a description")
	            .setColor(Color.RED)
	            .addField("1st Field", "Inline", true)
	    .addField("2nd Field", "Inline", true)
	    .addField("3rd Field", "No-Inline", false)
	    .setThumbnail("https://kryptongta.com/images/kryptonlogo.png")
	    .setFooter("Footer text", "https://kryptongta.com/images/kryptonlogodark.png")
	    .setImage("https://kryptongta.com/images/kryptontitle2.png")
	    .setAuthor("Author Name", "https://kryptongta.com", "https://kryptongta.com/images/kryptonlogowide.png")
	    .setUrl("https://kryptongta.com"));
	    webhook.addEmbed(new DiscordWebhook.EmbedObject()
	    .setDescription("Just another added embed object!"));
	    webhook.execute(); //Handle exception
	}

}
