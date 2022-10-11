package com.github.yuri0x7c1.vaadin.addon.demo;

import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn;
import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn.Size;
import org.vaadin.addons.yuri0x7c1.bslayout.BsLayout;
import org.vaadin.addons.yuri0x7c1.bslayout.BsRow;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Pre;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@CssImport("./styles.css")
@Route(value = "", layout = MainLayout.class)
public class BsLayoutView extends VerticalLayout {

	public BsLayoutView() {
		addExample(
			"Equal-width",
			new BsLayout().withRows(
				new BsRow().withColumns(
					new BsColumn(new Label("1 of 2")).withSize(Size.XS),
					new BsColumn(new Label("2 of 2")).withSize(Size.XS)
				),
				new BsRow().withColumns(
					new BsColumn(new Label("1 of 3")).withSize(Size.XS),
					new BsColumn(new Label("2 of 3")).withSize(Size.XS),
					new BsColumn(new Label("3 of 3")).withSize(Size.XS)
				)
			),
			"new BsLayout().withRows(\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"1 of 2\")).withSize(Size.XS),\n"
			+ "		new BsColumn(new Label(\"2 of 2\")).withSize(Size.XS)\n"
			+ "	),\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"1 of 3\")).withSize(Size.XS),\n"
			+ "		new BsColumn(new Label(\"2 of 3\")).withSize(Size.XS),\n"
			+ "		new BsColumn(new Label(\"3 of 3\")).withSize(Size.XS)\n"
			+ "	)\n"
			+ ");"
		);

		addExample(
			"Setting one column width",
			new BsLayout().withRows(
				new BsRow().withColumns(
					new BsColumn(new Label("1 of 3")).withSize(Size.XS),
					new BsColumn(new Label("2 of 3")).withSize(Size.XS, 6),
					new BsColumn(new Label("3 of 3")).withSize(Size.XS)
				),
				new BsRow().withColumns(
					new BsColumn(new Label("1 of 3")).withSize(Size.XS),
					new BsColumn(new Label("2 of 3")).withSize(Size.XS, 5),
					new BsColumn(new Label("3 of 3")).withSize(Size.XS)
				)
			),
			"new BsLayout().withRows(\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"1 of 3\")).withSize(Size.XS),\n"
			+ "		new BsColumn(new Label(\"2 of 3\")).withSize(Size.XS, 6),\n"
			+ "		new BsColumn(new Label(\"3 of 3\")).withSize(Size.XS)\n"
			+ "	),\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"1 of 3\")).withSize(Size.XS),\n"
			+ "		new BsColumn(new Label(\"2 of 3\")).withSize(Size.XS, 5),\n"
			+ "		new BsColumn(new Label(\"3 of 3\")).withSize(Size.XS)\n"
			+ "	)\n"
			+ ");"
		);
	}

	private void addExample(String header, BsLayout layout, String sourceCode) {
		add(new H2(header));
		layout.addClassName("demo");
		add(layout);
		add(new Pre(sourceCode));
	}
}