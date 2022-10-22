package com.github.yuri0x7c1.vaadin.addon.demo;

import org.vaadin.addons.yuri0x7c1.bscard.BsCard;
import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn;
import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn.Size;
import org.vaadin.addons.yuri0x7c1.bslayout.BsLayout;
import org.vaadin.addons.yuri0x7c1.bslayout.BsRow;

import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "bs-card", layout = MainLayout.class)
public class BsCardView extends VerticalLayout {

	public BsCardView() {
		add(new BsLayout().withDefaultSize(Size.MD, 4).withRow(
				new BsRow().withColumns(
						new BsColumn(buildCard()),
						new BsColumn(buildCard()),
						new BsColumn(buildCard())
				)
		));
	}

	private BsCard buildCard() {
		BsCard card = new BsCard();
		card.setWidth(100, Unit.PERCENTAGE);
    	card.addToTopImage(new Image("./600x200.png", "600x200"));
    	card.addToHeader(new HorizontalLayout(new Paragraph("Header"), new Button("Click Me!")));
    	card.addToTitle(new H5("Card Title"));
    	card.addToSubtitle(new H6("Card Subtitle"));
    	card.addToText(new Paragraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce venenatis tristique libero, "
    			+ "sit amet auctor eros tempus ac. Mauris justo sapien, aliquet a varius eu, elementum eget urna. Donec maximus "
    			+ "finibus ullamcorper. Nunc eu cursus justo. Aliquam cursus sem ut eros ullamcorper, eget varius felis tincidunt. "
    			+ "Phasellus placerat felis et leo efficitur eleifend. Sed a lectus erat. Etiam eget iaculis erat. Morbi quis "
    			+ "congue ligula. Integer lacinia diam dui, sit amet laoreet dui viverra rhoncus. Maecenas sollicitudin, turpis "
    			+ "eget gravida rhoncus, eros est elementum dui, et efficitur est libero id leo. Nunc sed ornare erat. Duis felis "
    			+ "lectus, tincidunt vitae est convallis, suscipit lacinia ex."));
    	card.add(new Button("Click Me!"));
    	card.addToFooter(new HorizontalLayout(new Paragraph("Footer"), new Button("Click Me!")));
		return card;
	}
}