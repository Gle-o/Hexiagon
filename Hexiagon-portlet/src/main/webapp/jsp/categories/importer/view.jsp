<%@include file="../../init.jsp"%>
<portlet:resourceURL var="exportURL" ></portlet:resourceURL>
<portlet:actionURL var="importURL" >
   <portlet:param name="name" value="import"/>
</portlet:actionURL>

<liferay-ui:panel id="export" title="Export..." collapsible="<%=true %>" extended="<%= true %>" persistState="<%= false %>">
	<aui:form action="${exportURL}" method="POST" name="searchGroupForm" id="searchGroupForm" >
		<aui:button-row>
			<aui:button type="submit" value="export"/>
		</aui:button-row>
	</aui:form>
</liferay-ui:panel>

<liferay-ui:panel id="import" title="Import..." collapsible="true" extended="<%= true %>" persistState="<%= false %>">
	<aui:form action="${importURL}" enctype="multipart/form-data" method="POST" name="fm">
		<aui:input inlineField="true" name="fileCategory" type="file" label="annoucements.categories.importer.panel.xml.label">
			<aui:validator name="acceptFiles">'xml'</aui:validator>
			<aui:validator name="required"/>
		</aui:input>
		<aui:button-row>
			<aui:button type="submit" value="import"/>
		</aui:button-row>
	</aui:form>
</liferay-ui:panel>