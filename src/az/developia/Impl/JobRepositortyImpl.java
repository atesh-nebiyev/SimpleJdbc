package az.developia.Impl;

import az.developia.DbConfig;
import az.developia.Job;
import az.developia.Repository.JobRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class JobRepositortyImpl implements JobRepository {
    private static final Logger LOG = Logger.getLogger(JobRepository.class.getName());

   @Override
   public List<Job> findAll(){
       LOG.info("findAll.start");
       var arr = new ArrayList<Job>();
       var sql = """
               select *
               from jobs;
               where job_title = ?;
               """;
       try (
               var conn = DbConfig.getConnectionWithDriverManager();
               var statement = conn.prepareStatement(sql);
               var resultSet = statement.executeQuery();

               ){
           while (resultSet.next()) {
               var title = resultSet.getString("job_title");
               arr.add(new Job (title));
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       LOG.info("findAll.end");
       return arr;
   }

    @Override
    public Job save(Job j) {
        return null;
    }

    @Override
    public Optional<Job> finfByTitlt(String title) {
         return null;
    }
}
