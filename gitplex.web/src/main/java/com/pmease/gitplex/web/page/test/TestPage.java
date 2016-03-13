package com.pmease.gitplex.web.page.test;

import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;

import com.pmease.gitplex.web.page.base.BasePage;

@SuppressWarnings("serial")
public class TestPage extends BasePage {

	private String name;
	
	@Override
	protected void onInitialize() {
		super.onInitialize();

		add(new Form<Void>("form") {

			@Override
			protected void onSubmit() {
				super.onSubmit();
				System.out.println(name);
			}

			@Override
			protected void onInitialize() {
				super.onInitialize();
				add(new TextField<String>("name", new IModel<String>() {

					@Override
					public void detach() {
					}

					@Override
					public String getObject() {
						return name;
					}

					@Override
					public void setObject(String object) {
						name = object;
					}
					
				}));
			}
			
		});
	}

}
