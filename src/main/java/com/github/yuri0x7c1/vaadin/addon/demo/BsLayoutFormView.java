package com.github.yuri0x7c1.vaadin.addon.demo;

import java.time.LocalDate;

import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn;
import org.vaadin.addons.yuri0x7c1.bslayout.BsColumn.Size;
import org.vaadin.addons.yuri0x7c1.bslayout.BsLayout;
import org.vaadin.addons.yuri0x7c1.bslayout.BsRow;
import org.vaadin.firitin.components.datepicker.VDatePicker;
import org.vaadin.firitin.components.notification.VNotification;
import org.vaadin.firitin.components.textfield.VTextArea;
import org.vaadin.firitin.components.textfield.VTextField;
import org.vaadin.firitin.form.AbstractForm;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Route(value = "bs-layout-form", layout = MainLayout.class)
public class BsLayoutFormView extends Div {

	@Data
	public static class DemoEntity {
		private String firstName;
		private String lastName;
		private LocalDate birthDate;
		private String description;
	}

	public static class DemoEntityForm extends AbstractForm<DemoEntity> {
		private VTextField firstName = new VTextField("First Name").withFullWidth();
		private VTextField lastName = new VTextField("Last Name").withFullWidth();
		private VDatePicker birthDate = new VDatePicker("Birth Date").withFullWidth();
		private VTextArea description = new VTextArea("Description").withFullWidth().withHeight("128px");


		public DemoEntityForm() {
			super(DemoEntity.class);
			getDeleteButton().setVisible(false);
		}

		@Override
		protected Component createContent() {
			return new BsLayout()
				.withRow(new BsRow()
					.withColumn(new BsColumn(firstName).withSizes(12, 4, 4, 3, 2))
					.withColumn(new BsColumn(lastName).withSizes(12, 4, 4, 3, 2))
					.withColumn(new BsColumn(birthDate).withSizes(12, 4, 4, 3, 2))
				)
				.withRow(new BsRow()
					.withColumn(new BsColumn(description).withSize(Size.LG, 9).withSize(Size.XL, 6))
				)
				.withRow(new BsRow()
					.withColumn(new BsColumn(getToolbar()).withSize(Size.XS, 12))
				);
		}

		@Override
		public HorizontalLayout getToolbar() {
			return super.getToolbar();
		}
	}

	public BsLayoutFormView() {
		DemoEntityForm form = new DemoEntityForm();
		DemoEntity entity = new DemoEntity();
		entity.setFirstName("John");
		entity.setLastName("Doe");
		entity.setBirthDate(LocalDate.of(2000, 1, 1));
		form.setEntity(entity);
		form.setSavedHandler(event -> VNotification.show(form.getEntity().toString()));
		form.setResetHandler(event -> form.setEntity(new DemoEntity()));
		add(form);
	}
}
