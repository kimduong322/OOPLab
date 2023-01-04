package hust.soict.hedspi.aims.screen;

import hust.soict.hedspi.aims.exception.PlayerException;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;

import javax.naming.LimitExceededException;
import javax.swing.*;

import aims.Aims;

import java.awt.*;

public class MediaStore extends JPanel {

	private Media media;
    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel title= new JLabel(media.getTitle());
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + "$");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton btAddToCart = new JButton("Add to cart");
        btAddToCart.addActionListener(e->{
            try {
				Aims.cart.addMedia(this.media);
			} catch (LimitExceededException e1) {
				
				e1.printStackTrace();
			}
        });
        container.add(btAddToCart);

        JButton btPlay = new JButton("Play");
        btPlay.addActionListener(e -> {
            try {
				media.play();
			} catch (PlayerException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        });
        if(media instanceof Playable) {
            container.add(btPlay);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}