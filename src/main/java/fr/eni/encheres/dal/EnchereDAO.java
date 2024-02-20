package fr.eni.encheres.dal;

import fr.eni.encheres.BusinessException;
import fr.eni.encheres.bo.Enchere;

import java.util.List;

public interface EnchereDAO {
    public void insert(Enchere enchere) throws BusinessException;
    public void delete(int id) throws BusinessException;
    public void update(Enchere enchere) throws BusinessException;
    public List<Enchere> selectAll() throws BusinessException;
    public Enchere selectById(int id) throws BusinessException;
}
