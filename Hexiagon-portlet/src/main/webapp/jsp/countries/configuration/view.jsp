<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@include file="/jsp/init.jsp" %>

<liferay-ui:success key="country-added" message="annoucements.country.success.added" />
<liferay-ui:success key="country-updated" message="annoucements.country.success.updated" />
<liferay-ui:success key="country-updated-active" message="annoucements.country.success.update.active" />

<liferay-ui:error key="country-error" message="annoucements.country.errors" />

<aui:nav-bar cssClass="label-info">
	<aui:nav >
		<portlet:renderURL var="addCountryURL">
			<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(renderRequest) %>" />
			<portlet:param name="jspPage" value="/jsp/countries/configuration/edit.jsp"/>
	    </portlet:renderURL>
	    
		<aui:nav-item href="${addCountryURL}" iconCssClass="icon-plus" label="annoucements.countries.add.label" />
		
	</aui:nav>
</aui:nav-bar>


<liferay-ui:search-container  searchContainer="${searchCountryContainer}" id="countries">
	<liferay-ui:search-container-results
		results="${searchCountryContainer.results}"
		total="${searchCountryContainer.total}" 
	/>
	
	<liferay-ui:search-container-row 
		className="com.liferay.portal.model.Country"
		keyProperty="countryId"
		modelVar="country" escapedModel="true"
	>			
		<liferay-ui:search-container-column-text
			name="name"
			value="${country.getName(locale)}"
		/>
		
		<liferay-ui:search-container-column-text
			name="active"
			value="${country.active}"
		/>
		
		<liferay-ui:search-container-column-text
			name="code"
			value="${country.a2}"
		/>
		<liferay-ui:search-container-column-jsp
				align="right"
 				name="actions"
				path="/jsp/countries/configuration/actions.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="true" searchContainer="${searchCountryContainer}"/>
</liferay-ui:search-container>