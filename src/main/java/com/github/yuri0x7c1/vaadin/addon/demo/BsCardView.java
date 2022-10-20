package com.github.yuri0x7c1.vaadin.addon.demo;

import org.vaadin.addons.yuri0x7c1.bscard.BsCard;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@CssImport("./styles.css")
@Route(value = "", layout = MainLayout.class)
public class BsCardView extends VerticalLayout {

	public BsCardView() {
		add(new H2("BsCard"));

		BsCard card = new BsCard();
		card.add(new Label("Hello!"));

		add(card);
	}
}