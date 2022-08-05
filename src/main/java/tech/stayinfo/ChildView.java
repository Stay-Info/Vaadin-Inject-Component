package tech.stayinfo;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

/**
 * A Designer generated component for the child-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("child-view")
@JsModule("./src/child-view.ts")
@Dependent
public class ChildView extends LitTemplate {
	
	@Inject
    public ChildView(InjectedView injectedView) {
    }

}
