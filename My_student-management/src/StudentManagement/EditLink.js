import React from 'react';

class EditLink extends React.Component
{
 
    render()
    {
        return(
                <div>
                    <tr> 
                        <td> <a href="/ListOfStudents/EditStudent">   Edit   </a> </td>
                        <td> <a href="/ListOfStudents/DeleteStudent"> Delete </a> </td>
                    </tr>
                </div>
        );
    }
}
export default EditLink;