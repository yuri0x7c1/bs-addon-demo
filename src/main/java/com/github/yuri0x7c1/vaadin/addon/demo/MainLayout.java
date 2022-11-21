package com.github.yuri0x7c1.vaadin.addon.demo;

import org.vaadin.firitin.components.html.VH2;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

@CssImport("./styles.css")
public class MainLayout extends AppLayout {

	public MainLayout() {
		addToNavbar(true,
				new DrawerToggle(),
				new VH2("BsLayout and BsCard Addon Demo").withAddedClassName(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE)
		);

		addToDrawer(new VerticalLayout(
				new RouterLink("BsLayout Demo", BsLayoutView.class),
				new RouterLink("BsLayout Form Demo", BsLayoutFormView.class),
				new RouterLink("BsCard Demo", BsCardView.class)
		));
	}
}