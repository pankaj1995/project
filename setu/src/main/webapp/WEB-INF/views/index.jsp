<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="form.title" /></title>
</head>
<body>
    <h1><spring:message code="form.title" /></h1>

    <a href="?lang=en">English</a> | <a href="?lang=mr">मराठी</a>

    <form action="/submit" method="post">
        <label><spring:message code="form.fullname" /></label>
        <input type="text" name="beneficiaryName" required><br>

        <label><spring:message code="form.fathername" /></label>
        <input type="text" name="fatherName" required><br>

        <label><spring:message code="form.address" /></label>
        <textarea name="address" required></textarea><br>

        <label><spring:message code="form.caste" /></label>
        <input type="text" name="caste" required><br>

        <label><spring:message code="form.mobile" /></label>
        <input type="text" name="mobile" required><br>

        <label><spring:message code="form.email" /></label>
        <input type="email" name="email" required><br>

        <label><spring:message code="form.certificateType" /></label>
        <select name="certificateType">
            <option value="Normal">Normal</option>
            <option value="Urgent">Urgent</option>
            <option value="Tatkal">Tatkal</option>
        </select><br>

        <label><spring:message code="form.documents" /></label>
        <input type="file" name="documents" required><br>

        <button type="submit"><spring:message code="form.submit" /></button>
    </form>
</body>
</html>
