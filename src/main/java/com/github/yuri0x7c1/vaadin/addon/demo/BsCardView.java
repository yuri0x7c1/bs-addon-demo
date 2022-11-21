package com.github.yuri0x7c1.vaadin.addon.demo;

import org.vaadin.addons.yuri0x7c1.bscard.BsCard;
import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn;
import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn.Size;
import org.vaadin.addons.yuri0x7c1.bslayout.BsLayout;
import org.vaadin.addons.yuri0x7c1.bslayout.BsRow;

import com.github.javafaker.Faker;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "bs-card", layout = MainLayout.class)
public class BsCardView extends VerticalLayout {

	public BsCardView() {
		add(new BsLayout().withDefaultSize(Size.MD, 4).withDefaultSize(Size.LG, 3).withRow(
				new BsRow().withColumns(
						new BsColumn(buildCard(1, true, true)),
						new BsColumn(buildCard(2, false, true)),
						new BsColumn(buildCard(3, true, false))
				)
		));
	}

	private BsCard buildCard(int number, boolean withImage, boolean withImageOnTop) {
		BsCard card = new BsCard();
		card.setWidth(100, Unit.PERCENTAGE);
		if (withImage) {
			if (withImageOnTop) {
				card.addTopImageComponent(new Image("./600x200.png", "600x200"));
			}
			else {
				card.addBottomImageComponent(new Image("./600x200.png", "600x200"));
			}
		}
    	card.addHeaderComponent(
    		new BsLayout().withRow(new BsRow()
    				.withColumn(new BsColumn(new Paragraph("Header " + number)).withSize(Size.XS))
    				.withColumn(new BsColumn(new Button("Click Me")).withSize(Size.XS))
    		)
    	);
    	card.addTitleComponent(new H5("Card Title" + number));
    	card.addSubtitleComponent(new H6("Card " + number + " Subtitle"));
    	card.addTextComponent(new Paragraph(new Faker().lorem().paragraph()));
    	card.add(new Button("Click Me!"));
    	card.addFooterComponent(
        		new BsLayout().withRow(new BsRow()
        				.withColumn(new BsColumn(new Paragraph("Footer " + number)).withSize(Size.XS))
        				.withColumn(new BsColumn(new Button("Click Me")).withSize(Size.XS))
        		)
        	);
		return card;
	}
}