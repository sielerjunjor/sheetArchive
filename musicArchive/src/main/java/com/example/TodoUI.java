package com.example;

import com.vaadin.annotations.Theme;
import com.vaadin.event.ShortcutAction;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
@Theme("valo")
public class TodoUI extends UI {

	private VerticalLayout layout;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		setupLayout();
		addHeader();
		addBody();
	}

	private void setupLayout() {
		layout = new VerticalLayout();
		layout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		setContent(layout);
	}

	private void addHeader() {
		Label header = new Label("Noten Archiv");
		header.addStyleName(ValoTheme.LABEL_H1);
		layout.addComponent(header);

	}

	private void addBody() {
		VerticalLayout formLayout = new VerticalLayout();
		formLayout.setWidth("80%");

		MenuBar mnBar = new MenuBar();
		mnBar.addItem("Stücke", null);
		mnBar.addItem("Neues Stück", null);
		mnBar.addItem("Mappenverwaltung", null);
		mnBar.addItem("Support", null);

		TabSheet tb_piece = new TabSheet();

		// TODO erstze 4 mit anzahl Mappen dynamisch...
		for (int i = 0; i < 4; i++) {
			final VerticalLayout layout = new VerticalLayout();
			layout.addComponent(new Label("Test"));
			layout.setMargin(true);

			tb_piece.addTab(layout, "Tab " + i);
		}

		formLayout.addComponent(mnBar);
		formLayout.addComponent(tb_piece);
		layout.addComponent(formLayout);

	}

}
