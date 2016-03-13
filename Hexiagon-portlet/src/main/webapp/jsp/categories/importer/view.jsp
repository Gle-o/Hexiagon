<%@include file="/jsp/init.jsp" %>

<portlet:actionURL name='loadCategoriesFromCsv' var="loadCategoriesCSVURL" windowState="normal" />

<aui:form action="${loadCategoriesCSVURL}" enctype="multipart/form-data" method="POST" name="fm">
	<liferay-ui:panel iconCssClass="icon-tags" defaultState="open" extended="true" id="qualificationProspectAdress" persistState="false" title="annoucements.categories.importer.panel.title">
		<aui:fieldset>
			<aui:input inlineField="true" name="fileCategory" type="file" label="annoucements.categories.importer.panel.csv.label">
				<aui:validator name="acceptFiles">'csv'</aui:validator>
			</aui:input>
		</aui:fieldset>
	</liferay-ui:panel>
	
	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>