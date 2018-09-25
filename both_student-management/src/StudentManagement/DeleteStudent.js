import React from 'react';

class DeleteStudent extends React.Component
{
    constructor(props)
    {
        super(props)
        this.handleBack=this.handleBack.bind(this);
        this.deleteStudent = this.deleteStudent.bind(this); 
    }
    handleBack()
    {
        this.props.history.push('/ListOfStudents');
    }
    deleteStudent(id) 
    {
        fetch ("http://localhost:8080/api/delete/students/{"+id+"}",
        { method: 'DELETE', 
          credentials: 'same-origin'})
        .then( 
            res => this.props.loadStudentsFromServer()
        )
        .catch( err => console.error(err))                
    }  
    render()
    {
        return(
            <div>
                {alert("Student Deleted")}
                {this.deleteStudent()}
                {this.handleBack()} 
                </div>
        );
    }
}
export default DeleteStudent;