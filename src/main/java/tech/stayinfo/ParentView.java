package tech.stayinfo;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the parent-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("parent-view")
@JsModule("./src/parent-view.ts")
@Route("parent")
public class ParentView extends LitTemplate {

    @Id("childView")
	private ChildView childView;

}
