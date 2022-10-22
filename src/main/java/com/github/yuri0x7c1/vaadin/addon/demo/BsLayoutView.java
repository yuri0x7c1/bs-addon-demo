package com.github.yuri0x7c1.vaadin.addon.demo;

import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn;
import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn.Offset;
import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn.Size;
import org.vaadin.addons.yuri0x7c1.bslayout.BsLayout;
import org.vaadin.addons.yuri0x7c1.bslayout.BsRow;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Pre;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
public class BsLayoutView extends VerticalLayout {

	public BsLayoutView() {
		add(new H2("Auto-layout columns"));

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

		add(new H2("Responsive classes"));

		/*
		addExample(
			"All breakpoints",
			new BsLayout().withRows(
				new BsRow().withColumns(
					new BsColumn(new Label("col")).withSize(Size.XS),
					new BsColumn(new Label("col")).withSize(Size.XS),
					new BsColumn(new Label("col")).withSize(Size.XS),
					new BsColumn(new Label("col")).withSize(Size.XS)
				),
				new BsRow().withColumns(
					new BsColumn(new Label("col-8")).withSize(Size.XS, 8),
					new BsColumn(new Label("col-4")).withSize(Size.XS, 4)
				)
			),
			"new BsLayout().withRows(\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"col\")).withSize(Size.XS),\n"
			+ "		new BsColumn(new Label(\"col\")).withSize(Size.XS),\n"
			+ "		new BsColumn(new Label(\"col\")).withSize(Size.XS),\n"
			+ "		new BsColumn(new Label(\"col\")).withSize(Size.XS)\n"
			+ "	),\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"col-8\")).withSize(Size.XS, 8),\n"
			+ "		new BsColumn(new Label(\"col-4\")).withSize(Size.XS, 4)\n"
			+ "	)\n"
			+ ");"
		);
		*/

		addExample(
			"Mix and match",
			new BsLayout().withRows(
				// Stack the columns on mobile by making one full-width and the other half-width
				new BsRow().withColumns(
					new BsColumn(new Label("xs-12 md-8")).withSize(Size.XS, 12).withSize(Size.MD, 8),
					new BsColumn(new Label("xs-6 md-4")).withSize(Size.XS, 6).withSize(Size.MD, 4)
				),
				// Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop
				new BsRow().withColumns(
					new BsColumn(new Label("xs-6 md-4")).withSize(Size.XS, 6).withSize(Size.MD, 4),
					new BsColumn(new Label("xs-6 md-4")).withSize(Size.XS, 6).withSize(Size.MD, 4),
					new BsColumn(new Label("xs-6 md-4")).withSize(Size.XS, 6).withSize(Size.MD, 4)
				),
				// Columns are always 50% wide, on mobile and desktop
				new BsRow().withColumns(
					new BsColumn(new Label("xs-6")).withSize(Size.XS, 6),
					new BsColumn(new Label("xs-6")).withSize(Size.XS, 6)
				)
			),
			"new BsLayout().withRows(\n"
			+ "	// Stack the columns on mobile by making one full-width and the other half-width\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"xs-12 md-8\")).withSize(Size.XS, 12).withSize(Size.MD, 8),\n"
			+ "		new BsColumn(new Label(\"xs-6 md-4\")).withSize(Size.XS, 6).withSize(Size.MD, 4)\n"
			+ "	),\n"
			+ "	// Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"xs-6 md-4\")).withSize(Size.XS, 6).withSize(Size.MD, 4),\n"
			+ "		new BsColumn(new Label(\"xs-6 md-4\")).withSize(Size.XS, 6).withSize(Size.MD, 4),\n"
			+ "		new BsColumn(new Label(\"xs-6 md-4\")).withSize(Size.XS, 6).withSize(Size.MD, 4)\n"
			+ "	),\n"
			+ "	// Columns are always 50% wide, on mobile and desktop\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"xs-6\")).withSize(Size.XS, 6),\n"
			+ "		new BsColumn(new Label(\"xs-6\")).withSize(Size.XS, 6)\n"
			+ "	)\n"
			+ ");"
		);

		add(new H2("Offsetting columns"));

		addExample(
			"Offset classes",
			new BsLayout().withRows(
				new BsRow().withColumns(
					new BsColumn(new Label("md-4")).withSize(Size.MD, 4),
					new BsColumn(new Label("md-4 offset-md-4")).withSize(Size.MD, 4).withOffset(Offset.MD, 4)
				),
				new BsRow().withColumns(
					new BsColumn(new Label("md-3 offset-md-3")).withSize(Size.MD, 3).withOffset(Offset.MD, 3),
					new BsColumn(new Label("md-3 offset-md-3")).withSize(Size.MD, 3).withOffset(Offset.MD, 3)
				),
				new BsRow().withColumn(
					new BsColumn(new Label("md-6 offset-md-3")).withSize(Size.MD, 6).withOffset(Offset.MD, 3)
				)
			),
			"new BsLayout().withRows(\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"md-4\")).withSize(Size.MD, 4),\n"
			+ "		new BsColumn(new Label(\"md-4 offset-md-4\")).withSize(Size.MD, 4).withOffset(Offset.MD, 4)\n"
			+ "	),\n"
			+ "	new BsRow().withColumns(\n"
			+ "		new BsColumn(new Label(\"md-3 offset-md-3\")).withSize(Size.MD, 3).withOffset(Offset.MD, 3),\n"
			+ "		new BsColumn(new Label(\"md-3 offset-md-3\")).withSize(Size.MD, 3).withOffset(Offset.MD, 3)\n"
			+ "	),\n"
			+ "	new BsRow().withColumn(\n"
			+ "		new BsColumn(new Label(\"md-6 offset-md-3\")).withSize(Size.MD, 6).withOffset(Offset.MD, 3)\n"
			+ "	)\n"
			+ ");"
		);

	}

	private void addExample(String header, BsLayout layout, String sourceCode) {
		add(new H3(header));

		layout.addClassName("bs-layout-demo");
		add(layout);

		Pre sourcePre = new Pre(sourceCode);
		sourcePre.setWidthFull();
		sourcePre.addClassName("source-pre");
		add(sourcePre);
	}
}